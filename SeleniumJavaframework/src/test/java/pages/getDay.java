package pages;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.openqa.selenium.WebElement;


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
	    
	    //Click to given day
	    public static void clickGivenDay(List<WebElement> elementList, String day) {
	        //DatePicker is a table. Thus we can navigate to each cell
	        //and if a cell matches with the current date then we will click it.
	        /**Functional JAVA version of this method.*/
	        elementList.stream()
	            .filter(element -> element.getText().contains(day))
	            .findFirst()
	            .ifPresent(WebElement::click);
	        /**Non-functional JAVA version of this method.*/
	        //for (
	        //    WebElement cell : elementList) {
	        //    String cellText = cell.getText();
	        //    if (cellText.contains(day)) {
	        //        cell.click();
	        //        break;
	        //    }
	        //}
	    }
		
	}

