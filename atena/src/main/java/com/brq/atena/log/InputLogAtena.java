package com.brq.atena.log;

import java.util.Date;

import org.springframework.jdbc.core.JdbcTemplate;

import com.brq.atena.model.Status;
import com.brq.atena.wsdl.conector.PortabilityTicketOut;

import ch.qos.logback.core.net.SyslogOutputStream;




public class InputLogAtena {
    
	JdbcTemplate jdbcTemplate;
	
	public InputLogAtena(JdbcTemplate jdbcTemplate ) {
		this.jdbcTemplate = jdbcTemplate;
		
		// TODO Auto-generated constructor stub
	}
     

	String SQL = " Insert Into  SPN_ATENA_LOG (NR_TELEFONE,NR_PROTOCOLO,CD_TIPO_TRANSACAO,CD_ASSINANTE,DT_JANELA_MIGRACAO,CD_STATUS_VERSAO_OLD,CD_STATUS_VERSAO_EA,\r\n" + 
			"   CD_STATUS_TRANSACAO_OLD,CD_STATUS_TRANSACAO_EA,TRANSACAO,DT_CRIACAO) values (?,?,?,?,?,?,?,?,?,?,sysdate)";
	
	
    public void inserirLogAtena(Status status, PortabilityTicketOut portabilityTicketOut, String transacao) throws Exception {
    	try {
			 	Date date = portabilityTicketOut.getSubscriptionDueDate().toGregorianCalendar().getTime();
    	
    	jdbcTemplate.update(SQL, new Object[] {status.getTelefone(),status.getProtocolo(),status.getTipoTransacao(),status.getAssinante(),date,
    			status.getStatusVersao(),"null",status.getStatusTransacao(),portabilityTicketOut.getStatusSpg(), transacao});
    	} catch (org.springframework.dao.DuplicateKeyException ex ) {
		    System.out.println("Duplicate.");
		}
    }
    
    public void inserirLogAtena(Status status, String transacao) throws Exception {  	
    	try {
			 	
    	jdbcTemplate.update(SQL, new Object[] {status.getTelefone(),status.getProtocolo(),status.getTipoTransacao(),status.getAssinante(),null,
    			status.getStatusVersao(),null,status.getStatusTransacao(),null, transacao});
    	} catch (org.springframework.dao.DuplicateKeyException ex) {
			
		}   
    }
    
}
