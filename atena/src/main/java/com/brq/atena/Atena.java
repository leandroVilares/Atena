package com.brq.atena;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication(scanBasePackages = { "com.brq.atena" })
@ImportResource("/atena/config.xml")
public class Atena {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Atena.class, args);
		}

}
