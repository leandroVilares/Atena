package com.brq.atena;


import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

import com.brq.atena.service.InvocarWebservice;

public class TesteWebservice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("iniciando");
		InvocarWebservice sigan = new InvocarWebservice();
		System.out.println("iniciando2");
		sigan.createTemplateSigan("5521996774677");
		//datainicial();
		//Datafinal();
	
	}

     public static void datainicial() {
    	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	 Calendar calendar = Calendar.getInstance();
         calendar.add(calendar.DAY_OF_MONTH, -1);
         calendar.set(calendar.HOUR_OF_DAY, 0);
         calendar.set(calendar.MINUTE, 0);
         calendar.set(calendar.SECOND, 0);
         System.out.println(dateFormat.format(calendar.getTime()).toString());
     }
     
     public static void Datafinal() {
    	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	 Calendar calendar = Calendar.getInstance();
         calendar.add(calendar.DAY_OF_MONTH, -1);
         calendar.set(calendar.HOUR_OF_DAY, 23);
         calendar.set(calendar.MINUTE, 59);
         calendar.set(calendar.SECOND, 59);
         System.out.println(dateFormat.format(calendar.getTime()).toString());
     }
     
     
}
