package com.brq.atena.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

	public void iniciar(List<Status> listaStatus) throws Exception {
		try {
		// querie e classe de logica
		System.out.println("Iniciando ATENA!    " + datainicial() );
		TratarLinhas tratarLinhas = new TratarLinhas();
		tratarLinhas.tratarLista(listaStatus, jdbcTemplate);
		} catch (Exception e) {
		}
	}
	
	  public  String   datainicial() {
	    	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    	 Calendar calendar = Calendar.getInstance();
	       
	         return "" + calendar.getTime().getYear()+"/"+calendar.getTime().getMonth()+"/"+calendar.getTime().getDay()
	        		 +" : "+calendar.getTime().getHours()+" : "+calendar.getTime().getMinutes()+" : "+ calendar.getTime().getSeconds();
	         
	         
	     }

}
