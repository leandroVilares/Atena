package com.brq.atena.service;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


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
	public void selectStatus(String[] nrTelefones) throws Exception{
		List<Status> listStatus = new ArrayList<Status>();
		 jdbcTemplate = new JdbcTemplate(this.dataSource);
		for (int i = 0; i < nrTelefones.length; i++) {
			Status status = (Status) this.jdbcTemplate.queryForObject(selectSQL, new AtenaRowMapper(),nrTelefones[i]);
			listStatus.add(status);
		}
	    tratarLinhas(listStatus,jdbcTemplate);
	}
	
	public void tratarLinhas(List<Status> listStatus,JdbcTemplate jdbcTemplate) throws Exception {
		TratarLinhas tratarlinhas =new TratarLinhas();
		tratarlinhas.tratarLista(listStatus, jdbcTemplate);
	}

	
	
}
