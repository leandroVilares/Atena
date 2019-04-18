package com.brq.atena.service;

import com.brq.atena.model.Status;
import com.brq.atena.wsdl.conector.PortabilityTicketOut;
import com.brq.atena.wsdl.sigan.ConsultarDadosNumeroResponse;

public class HabilitacaoLinhas {

	public HabilitacaoLinhas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void habilitarLinha(Status status, PortabilityTicketOut portabilityTicketOut) throws Exception {
		
		if (VerificarPrePos(status.getTelefone())) {
			HabilitarLinhaPre();
		} else {
			HabilitarLinhaPos();
		}

	}


	public boolean VerificarPrePos(String numero) throws Exception {
		InvocarWebservice invocarWebservice = new InvocarWebservice();
		boolean tipo = false;
		ConsultarDadosNumeroResponse consultarDadosNumeroResponse = invocarWebservice.createTemplateSigan(numero);

		if (consultarDadosNumeroResponse.getRespostaWS().getMsisdnsEncontrados().getNumeroWSTO().get(0)
				.getTipoNumero() == 2) {

			tipo = true;
		}
		return tipo;
	}
	
	
	private void HabilitarLinhaPos() {

	}

	private void HabilitarLinhaPre() {

	}

}
