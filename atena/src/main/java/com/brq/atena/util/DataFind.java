package com.brq.atena.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFind {

	Date dataInicial;
	Date dataFinal;
	
	
	   public  Date  datainicial() {
	    	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    	 Calendar calendar = Calendar.getInstance();
	         calendar.add(calendar.DAY_OF_MONTH, -1);
	         calendar.set(calendar.HOUR_OF_DAY, 0);
	         calendar.set(calendar.MINUTE, 0);
	         calendar.set(calendar.SECOND, 0);
	         return dataInicial= calendar.getTime();
	         
	     }
	     
	     public Date   datafinal() {
	    	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    	 Calendar calendar = Calendar.getInstance();
	         calendar.add(calendar.DAY_OF_MONTH, -1);
	         calendar.set(calendar.HOUR_OF_DAY, 23);
	         calendar.set(calendar.MINUTE, 59);
	         calendar.set(calendar.SECOND, 59);
	         return dataFinal =calendar.getTime();
	     }
	     
	     
	
}
