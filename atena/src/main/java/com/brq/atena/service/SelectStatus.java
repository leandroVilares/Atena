package com.brq.atena.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.brq.atena.model.AtenaRowMapper;
import com.brq.atena.model.Status;

public class SelectStatus implements SelectStatusInterface{
    
	    
	    private DataSource dataSource;
	    private JdbcTemplate jdbcTemplate;
	      
	    public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }
	     
	


	String selectSQL ="select NR_TELEFONE,NR_PROTOCOLO,CD_TIPO_TRANSACAO,CD_ASSINANTE,CD_STATUS_TRANSACAO,CD_STATUS_VERSAO,DT_JANELA_MIGRACAO \r\n" + 
			"from SPN_TRANSACAO where NR_TELEFONE =?" ;
	
	@SuppressWarnings("null")
	public List<Status> selectStatus(String[] nrTelefones){
		List<Status> listStatus = null;
		 jdbcTemplate = new JdbcTemplate(this.dataSource);
		for (int i = 0; i < nrTelefones.length; i++) {
			Status status = (Status) this.jdbcTemplate.query(selectSQL, new AtenaRowMapper(),nrTelefones[i]);
			listStatus.add(status);
		}
	  return listStatus ;
	}
	
	public void tratarLinhas(List<Status> listStatus) throws Exception {
		TratarLinhas tratarlinhas =new TratarLinhas();
		tratarlinhas.tratarLista(listStatus, jdbcTemplate);
	}

	
	
}
