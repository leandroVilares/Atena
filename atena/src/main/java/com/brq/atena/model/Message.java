package com.brq.atena.model;

import java.util.Date;

public class Message {
	String sequenciaControle;
	String tipoMensagem;
	String telefone;
	String cdMensagem;
	String statusMensagem;
	String origemMensagem;
	String statusProcessamento;
	Date DataCriacao;

	@Override
	public String toString() {
		return "Message [sequenciaControle=" + sequenciaControle + ", tipoMensagem=" + tipoMensagem + ", telefone="
				+ telefone + ", cdMensagem=" + cdMensagem + ", statusMensagem=" + statusMensagem + ", origemMensagem="
				+ origemMensagem + ", statusProcessamento=" + statusProcessamento + ", DataCriacao=" + DataCriacao
				+ "]";
	}

	public String getSequenciaControle() {
		return sequenciaControle;
	}

	public void setSequenciaControle(String sequenciaControle) {
		this.sequenciaControle = sequenciaControle;
	}

	public String getTipoMensagem() {
		return tipoMensagem;
	}

	public void setTipoMensagem(String tipoMensagem) {
		this.tipoMensagem = tipoMensagem;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCdMensagem() {
		return cdMensagem;
	}

	public void setCdMensagem(String cdMensagem) {
		this.cdMensagem = cdMensagem;
	}

	public String getStatusMensagem() {
		return statusMensagem;
	}

	public void setStatusMensagem(String statusMensagem) {
		this.statusMensagem = statusMensagem;
	}

	public String getOrigemMensagem() {
		return origemMensagem;
	}

	public void setOrigemMensagem(String origemMensagem) {
		this.origemMensagem = origemMensagem;
	}

	public String getStatusProcessamento() {
		return statusProcessamento;
	}

	public void setStatusProcessamento(String statusProcessamento) {
		this.statusProcessamento = statusProcessamento;
	}

	public Date getDataCriacao() {
		return DataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}

}
