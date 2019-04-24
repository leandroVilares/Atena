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

	public void tratarproblema(Status status, JdbcTemplate jdbcTemplate) {

		invocarWebservice = new InvocarWebservice();
		updateStatus = new UpdateStatus(jdbcTemplate);
		reprocessarSpn = new ReprocessarSPN(jdbcTemplate);

		int cont = 0;
		GetPortabilityHistoryResponse getPortabilityHistoryResponse = invocarWebservice
				.createTemplateConectorGetPortabilityHistory(status.getTelefone());

		List<PortabilityTicketOut> listPortabilityTicketOut =  getPortabilityHistoryResponse.getReturn();
		

		for (PortabilityTicketOut portabilityTicketOut : listPortabilityTicketOut) {
			if(portabilityTicketOut.getSistemaorigem().equals("SPN") & cont == 0) {
				if(portabilityTicketOut.getSubscriptionVersionId().equals(status.getProtocolo())) {
					try{
					updateStatus.manterStatus(status, portabilityTicketOut); 
					}catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					
				}else if (reprocessarSpn.reprocessarLinhas(status)) {
					System.out.println("Haviam mensagens paradas! Reprocessado!");  	
				}else if (reprocessarSpn.reprocessarLinhasHist(status)){
					System.out.println("Haviam mensagens paradas na tabela histórico! Reprocessado!");
				} else {
					System.out.println("Não haviam mensagens paradas em transação nas tabelas de controle! Bilhete do SPN"
							+ " não confere com ultimo bilhete do conector, verificar!");    	
				}
				cont++;
			}

		}

	}

}