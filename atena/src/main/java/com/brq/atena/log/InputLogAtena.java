package com.brq.atena.log;

import org.springframework.jdbc.core.JdbcTemplate;

import com.brq.atena.model.Status;




public class InputLogAtena {
    
	JdbcTemplate jdbcTemplate;
	
	public InputLogAtena(JdbcTemplate jdbcTemplate ) {
		this.jdbcTemplate = jdbcTemplate;
		
		// TODO Auto-generated constructor stub
	}
     

	String SQL = " Insert Into  SPN_ATENA_LOG (NR_TELEFONE,NR_PROTOCOLO,CD_TIPO_TRANSACAO,CD_ASSINANTE,DT_JANELA_MIGRACAO,CD_STATUS_VERSAO_OLD,CD_STATUS_VERSAO_EA\r\n" + 
			"   CD_STATUS_TRANSACAO_OLD,CD_STATUS_TRANSACAO_EA,TRANSACAO,DT_CRIACAO) values (?,?,?,?,?,?,?,?,?,?,sysdate)" ;
	
	
    public void inserirLogAtena(Status status) {
    	
    	jdbcTemplate.update(SQL, new Object[] { status.getTelefone(),status.getProtocolo(),status.getTipoTransacao(),status.getAssinante(),status.getJanela(),
    			status.getStatusTransacao(),status.getStatusTransacao_EA(),status.getStatusTransacao(),status.getStatusTransacao_EA()});
    }

}
