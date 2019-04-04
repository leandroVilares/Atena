package com.brq.atena.service;

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


	public void tratarLista(List<Status> listaStatus, JdbcTemplate jdbcTemplate) throws Exception {
		InputLogAtena inputLogAtena = new InputLogAtena(jdbcTemplate);
		invocarWebservice = new InvocarWebservice();
		for (Status status : listaStatus ) {
			tratarproblema(status);
			inputLogAtena.inserirLogAtena(status);

		}
	}

	public void tratarproblema(Status status) {

		invocarWebservice = new InvocarWebservice();
		updateStatus = new UpdateStatus();
		reprocessarSpn = new ReprocessarSPN();
		
        int cont = 0;
		GetPortabilityHistoryResponse getPortabilityHistoryResponse = invocarWebservice
				.createTemplateConectorGetPortabilityHistory(status.getTelefone());

		List<PortabilityTicketOut> listPortabilityTicketOut =  getPortabilityHistoryResponse.getReturn();    
		
		for (PortabilityTicketOut portabilityTicketOut : listPortabilityTicketOut) {
             if(portabilityTicketOut.getSistemaorigem().equals("SPN") & cont == 0) {
            	 if(portabilityTicketOut.getSubscriptionVersionId().equals(status.getProtocolo())) {
            		 
            		 updateStatus.manterStatus(status, portabilityTicketOut); 
            	 }else if (reprocessarSpn.reprocessarLinhas(status)) {
            			 //Devolver "Reprocessado"        	
            	 }else {reprocessarSpn.reprocessarLinhasHist(status);}
            	 
                  cont++;
             }
		}


	}

	

}
