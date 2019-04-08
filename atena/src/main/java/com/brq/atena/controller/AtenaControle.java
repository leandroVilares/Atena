package com.brq.atena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.brq.atena.service.SelectStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@RestController
@RequestMapping("/atena")
public class AtenaControle {

	
	
	@RequestMapping(value = "/telefone/", method = RequestMethod.POST)
	public ResponseEntity<?> receiveNrtelefone(@RequestBody @JsonDeserialize(as=String.class) @JsonProperty("telefones") String[] nrTelefones, UriComponentsBuilder ucBuilder) {
		 
		//ConfigurableApplicationContext context = 
                //new ClassPathXmlApplicationContext("/atena/config.xml");
		//SelectStatus selectStatus = (SelectStatus)context.getBean("selectStatus");
		
		//context.close();
		return new ResponseEntity<String>("", HttpStatus.CREATED);
	}
	
	
	
}
