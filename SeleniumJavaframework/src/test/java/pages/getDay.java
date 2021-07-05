package pages;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class getDay {

	
	    //Get The Next Day
	    public static String getNextDay() {
	    	
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");  
	    	LocalDate date = LocalDate.now();
	    	date = date.plusDays(1);
	    	String nextDate = (formatter.format(date));
	    	//System.out.print(nextDate);
	    	return nextDate;
	    	
	    	
	   
	    }
	    

	    //Get The Previous Day
	    public static String getPreviousDate() {
	    	
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");  
	    	LocalDate date = LocalDate.now();
	    	date = date.minusDays(1);
	    	String prevDate = (formatter.format(date));
	    	//System.out.print(prevDate);
	    	return prevDate;
	    	
	    	
	   
	    }
	    
	
		
	}

