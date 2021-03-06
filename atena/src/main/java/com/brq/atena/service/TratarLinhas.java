package com.brq.atena.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.brq.atena.log.InputLogAtena;
import com.brq.atena.model.Status;
import com.brq.atena.wsdl.conector.GetPortabilityHistory;
import com.brq.atena.wsdl.conector.GetPortabilityHistoryResponse;
import com.brq.atena.wsdl.conector.GetTicketHistory;
import com.brq.atena.wsdl.conector.GetTicketHistoryResponse;
import com.brq.atena.wsdl.conector.PortabilityTicketOut;

public class TratarLinhas {

	public TratarLinhas() {
		super();
	}

	InvocarWebservice invocarWebservice;
	UpdateStatus updateStatus;
	ReprocessarSPN reprocessarSpn;
	InputLogAtena inputLogAtena;

	public void tratarLista(List<Status> listaStatus, JdbcTemplate jdbcTemplate) throws Exception {
		inputLogAtena = new InputLogAtena(jdbcTemplate);
		invocarWebservice = new InvocarWebservice();
		for (Status status : listaStatus) {
			tratarproblema(status, jdbcTemplate);
			//inputLogAtena.inserirLogAtena(status);

		}
	}

	public void tratarproblema(Status status, JdbcTemplate jdbcTemplate) throws Exception {

		invocarWebservice = new InvocarWebservice();
		updateStatus = new UpdateStatus(jdbcTemplate);
		reprocessarSpn = new ReprocessarSPN(jdbcTemplate);

		int cont = 0;
		GetPortabilityHistoryResponse getPortabilityHistoryResponse = invocarWebservice
				.createTemplateConectorGetPortabilityHistory(status.getTelefone());

		List<PortabilityTicketOut> listPortabilityTicketOut =  getPortabilityHistoryResponse.getReturn();
		
		if (listPortabilityTicketOut.isEmpty()) {
			String transacao = "Linha não foi encontrada no Conector, verificar!";
			inputLogAtena.inserirLogAtena(status, transacao);
		}
			
		
		for (PortabilityTicketOut portabilityTicketOut : listPortabilityTicketOut) {
			if(portabilityTicketOut.getSistemaorigem().equals("SPN") & cont == 0) {
				if(portabilityTicketOut.getSubscriptionVersionId().equals(status.getProtocolo())) {
					try{
					updateStatus.manterStatus(status, portabilityTicketOut); 
					String transacao = "Status Alterado!";
					inputLogAtena.inserirLogAtena(status, portabilityTicketOut, transacao);
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					
				}else if (reprocessarSpn.reprocessarLinhas(status)) {
					String transacao = "Haviam mensagens paradas! Reprocessado!";
					inputLogAtena.inserirLogAtena(status, portabilityTicketOut, transacao);
					//System.out.println("Haviam mensagens paradas! Reprocessado!");  	
				}else if (reprocessarSpn.reprocessarLinhasHist(status)){
					String transacao = "Haviam mensagens paradas na tabela histórico! Reprocessado!";
					inputLogAtena.inserirLogAtena(status, portabilityTicketOut, transacao);
					//System.out.println("Haviam mensagens paradas na tabela histórico! Reprocessado!");
				} else {
					String transacao = "Não haviam mensagens paradas em transação nas tabelas de controle! Bilhete do SPN não confere com ultimo bilhete do conector, verificar!";
					inputLogAtena.inserirLogAtena(status, portabilityTicketOut, transacao);
					//System.out.println("Não haviam mensagens paradas em transação nas tabelas de controle! Bilhete do SPN"
						//	+ " não confere com ultimo bilhete do conector, verificar!");    	
				}
				cont++;
			}

		}

	}

}