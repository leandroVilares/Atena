package com.brq.atena.model;

import java.util.Date;

public class Status {
	String telefone;
	String protocolo;
	String tipoTransacao;
	String assinante;
	String statusTransacao;
	String statusVersao;
	String statusTransacao_EA;
	public String getStatusTransacao_EA() {
		return statusTransacao_EA;
	}

	public void setStatusTransacao_EA(String statusTransacao_EA) {
		this.statusTransacao_EA = statusTransacao_EA;
	}

	String statusVersao_EA;
	Date janela;
	
	@Override
	public String toString() {
		return "ListaStatus [telefone=" + telefone + ", protocolo=" + protocolo + ", tipoTransacao=" + tipoTransacao + ", assinante="
				+ assinante + ", statusTransacao=" + statusTransacao + ", statusVersao=" + statusVersao + ", janela=" + janela + "]";
	
}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public String getAssinante() {
		return assinante;
	}

	public void setAssinante(String assinante) {
		this.assinante = assinante;
	}

	public String getStatusTransacao() {
		return statusTransacao;
	}

	public void setStatusTransacao(String statusTransacao) {
		this.statusTransacao = statusTransacao;
	}

	public String getStatusVersao() {
		return statusVersao;
	}

	public void setStatusVersao(String statusVersao) {
		this.statusVersao = statusVersao;
	}

	public Date getJanela() {
		return janela;
	}

	public void setJanela(Date janela) {
		this.janela = janela;
	}

}