package pages;
import java.awt.AWTException;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;





public class BootstrapDatePickersObjects {
	
	private WebDriver driver;
	static String result;
 	ExtentReports report;
	ExtentTest test;
	
	


	 public BootstrapDatePickersObjects( WebDriver driver) {

		this.driver = driver;
	}


	@Test
	public void goToDatePickerPage() {
		
		driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(2) > i")).click();
		driver.findElement(By.cssSelector("ul#treemenu  ul > li:nth-of-type(2) > ul > li:nth-of-type(1) > a")).click();
		
	}


	static By clickSelectDateField = By.cssSelector(".col-xs-4  .form-control");
	static By todayDate = By.cssSelector(".datepicker-days tfoot .today");
	static By DateFieldValue = By.cssSelector("#sandbox-container1 > div");
	static By clickStartDateField = By.cssSelector("div#datepicker > input:nth-of-type(1)");
	

	@BeforeClass	
	public void beforeClass() {

		report =  ExtentFactory.getInstance();


	}


	

    @Test
    
    public void selectTodayDate ()throws InterruptedException{
    	
    	driver.findElement(clickSelectDateField).click();
    	Thread.sleep(2000);
    	driver.findElement(todayDate).click();
    	DateFieldValue.equals(todayDate);
    	
   	
    }

    @Test
    public void selecRandomStartEndDate ()throws InterruptedException, AWTException{
    	
    	driver.findElement(clickStartDateField).click();

    	java.util.List<WebElement> days = driver.findElements(By.cssSelector(" div.datepicker-days > table > tbody"));

    	int maxCities = days.size();
    	// get random number
    	Random random = new Random();
    	int randomDate = random.nextInt(maxCities);
    	days.get(randomDate).click();

    	//move mouse to another point
    	Actions actionProvider = new Actions(driver);
    	// Perform click-and-hold action on the element
    	actionProvider.clickAndHold().build().perform();

    }
    
    
    @Test
    public void selectNextDay()throws InterruptedException{
    	
    	driver.findElement(clickStartDateField).click();
    	String getNextDay = getDay.getNextDay();

    	Thread.sleep(1000);
    	WebElement dateWidgetForm= driver.findElement(By.cssSelector("div.datepicker-days > table > tbody"));
    	java.util.List<WebElement> columns = dateWidgetForm.findElements(By.tagName("td"));

    	for (WebElement cell: columns) {

    		Thread.sleep(1000);
    		if (cell.getText().equals(getNextDay)) {
    			cell.click();
    			break;
    		}

    	}

    	//move mouse to another point
    	Actions actionProvider = new Actions(driver);
    	// Perform click-and-hold action on the element
    	actionProvider.clickAndHold().build().perform();

    	 
    }
    
    
   public void selectPreviousDay()throws InterruptedException{
    	
    	driver.findElement(clickStartDateField).click();
    	String getPreviousDay = getDay.getPreviousDate();

    	Thread.sleep(1000);
    	WebElement dateWidgetForm= driver.findElement(By.cssSelector("div.datepicker-days > table > tbody"));
    	java.util.List<WebElement> columns = dateWidgetForm.findElements(By.tagName("td"));

    	for (WebElement cell: columns) {

    		Thread.sleep(1000);
    		if (cell.getText().equals(getPreviousDay)) {
    			cell.click();
    			break;
    		}

    	}

    	//move mouse to another point
    	Actions actionProvider = new Actions(driver);
    	// Perform click-and-hold action on the element
    	actionProvider.clickAndHold().build().perform();

    	 
    }
}

    


 
  

