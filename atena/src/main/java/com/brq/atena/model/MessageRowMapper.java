package com.brq.atena.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

public class MessageRowMapper implements org.springframework.jdbc.core.RowMapper<Message> {
	
	
	@Override
	public Message mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	
		
		Message objectMessage = new Message();
		
		try {
			
			objectMessage.setSequenciaControle(rs.getString("sq_controle_mensagem_ea"));
			objectMessage.setTipoMensagem(rs.getString("cd_tipo_mensagem_ea"));
			objectMessage.setTelefone(rs.getString("nr_telefone"));
			objectMessage.setCdMensagem(rs.getString("cd_mensagem"));
			objectMessage.setStatusMensagem(rs.getString("in_status_mensagem"));
			objectMessage.setOrigemMensagem(rs.getString("in_origem_mensagem"));
			objectMessage.setStatusProcessamento(rs.getString("in_status_processamento"));
			objectMessage.setDataCriacao(rs.getDate("dt_criacao"));
			
		} catch (Exception e) {
			
			
		} 
		
		return objectMessage;
	}
	

}