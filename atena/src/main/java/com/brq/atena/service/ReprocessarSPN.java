package com.brq.atena.service;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.brq.atena.model.Message;
import com.brq.atena.model.MessageRowMapper;
import com.brq.atena.model.Status;

public class ReprocessarSPN {
	

	public ReprocessarSPN() {
		super();
		// TODO Auto-generated constructor stub
	}

	JdbcTemplate jdbcTemplate;
	String SQLlistMessageEA = "select sq_controle_mensagem_ea, cd_tipo_mensagem_ea, nr_telefone, cd_mensagem, in_status_mensagem, in_origem_mensagem, in_status_processamento, dt_criacao from SPN_CONTROLE_MENSAGEM_EA where nr_telefone in (?) order by dt_mensagem_ea desc";
	String SQLlistMessageHist = "select sq_controle_mensagem_ea, cd_tipo_mensagem_ea, nr_telefone, cd_mensagem, in_status_mensagem, in_origem_mensagem, in_status_processamento, dt_criacao from SPN_CONTROLE_MENSAGEM_EA_HIST where nr_telefone in (?) order by dt_mensagem_ea desc";
	String SQLUpdateStatus = "update spn_ow.spn_transacao set cd_status_versao = 'pending', cd_status_transacao = '20', ds_erro = '' where NR_telefone in (?)";
	String SQLUpdateMensagem = "update SPN_CONTROLE_MENSAGEM_EA set in_status_mensagem = '0' where CD_MENSAGEM in (?)";

	public ReprocessarSPN(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public Boolean reprocessarLinhas(Status status) {
		boolean retorno = false;
		List<Message> messageList = jdbcTemplate.query(SQLlistMessageEA, new MessageRowMapper(), status.getTelefone());
		for (Message message : messageList) {
			if (!message.getStatusMensagem().equals("10") || !message.getStatusMensagem().equals("0")) {
				jdbcTemplate.update(SQLUpdateStatus, status.getTelefone());
				jdbcTemplate.update(SQLUpdateMensagem, message.getCdMensagem());
				retorno = true;
				break;
			}
		}
		return retorno;
	}

	
	public void reprocessarLinhasHist(Status status) {
		List<Message> messageHistList = jdbcTemplate.query(SQLlistMessageHist, new MessageRowMapper(),
				status.getTelefone());
		for (Message message : messageHistList) {
			if (!message.getStatusMensagem().equals("10") || !message.getStatusMensagem().equals("0")) {
				jdbcTemplate.update(SQLUpdateStatus, status.getTelefone());
				jdbcTemplate.update(SQLUpdateMensagem, message.getCdMensagem());
			}else System.out.println("TESTE");
		}

	}



}
