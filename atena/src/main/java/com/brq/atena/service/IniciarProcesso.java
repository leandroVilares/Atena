package com.brq.atena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.brq.atena.model.Status;

public class IniciarProcesso {
    
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public IniciarProcesso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void iniciar(List<Status>  listaStatus ) throws Exception {
	   //querie e classe de logica 	
	    TratarLinhas tratarLinhas = new TratarLinhas();
	    tratarLinhas.tratarLista(listaStatus, jdbcTemplate);
	   // for (Status listaStatu : listaStatus) {
		//	System.out.println(listaStatu.getProtocolo());
		
	    }
		
		
	}
	
	
