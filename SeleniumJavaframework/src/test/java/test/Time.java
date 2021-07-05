package test;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DatePrinter;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;

public class Time {
	

	   public static void main(String[] args) throws InterruptedException {
		   
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");  
	    	LocalDate date = LocalDate.now();
	    	date = date.minusDays(1);
	    	String prevDate = (formatter.format(date));
	    	System.out.print(prevDate);
	        
		   
		   /*
		   DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   String todayDate = (date.format(now)); 
		   
		   System.out.print(todayDate);
		 */  
	
	/*
		 LocalTime time = LocalTime.now();
		 
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm a");
		 
		 LocalTime newTime = time.plusHours(1);
		  
		 String timeString = newTime.format(formatter);    //12.38
		 
		 System.out.println(timeString);
		 
		   int minute = time.getMinute();
		
		   // Date nearestMinute = DateUtils.round(time, Calendar.MINUTE);
		  //  System.out.println("nearestMinute = " + formatter1.format(nearestMinute));
		 
	//	 int min = Integer.parseInt(timeString.trim());
		 System.out.println(minute);
			
		// minute  = minute.MeasurementTime.Minute + minute.MeasurementTime.Second/60;

		 minute = (int) (Math.round(minute / 15.0) * 15.0);

		 if(minute == 30) {
			 
			 minute = 00;
			 
			 System.out.println(minute);
		 }
		 

 
		   Calendar now = Calendar.getInstance();
		   DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm a");
		  //  System.out.println("Current time : " + (now.get(Calendar.HOUR) + 1) );
		    int time1 =  now.get(Calendar.HOUR)+1;
		    DateTimeFormatter time1 = DateTimeFormatter.ofPattern("hh:mm a");
		    
	*/

		
		//if (currentTime == "12:00 a") {
			 
		
	 //  }
		
		
		
	}
}
	


