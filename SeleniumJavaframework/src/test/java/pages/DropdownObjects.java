package pages;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class DropdownObjects {
	


	WebDriver driver;
	static String result;
	ExtentReports report;
	ExtentTest test;




	public DropdownObjects( WebDriver driver) {

		this.driver = driver;
	}


	@Test
	public void goToDropdownPage() {
		
		driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(4) > a")).click();
		
	}


	static By clickDropdownList = By.xpath("//*[@id=\"select-demo\"] ");
	static By selectedValue = By.cssSelector("p.selected-value");
	static By multiSelect = By.xpath("//*[@id=\"multi-select\"]");
	static By getAllSelected = By.xpath("//*[@id=\"printAll\"]");	
	static By getSelectedValue = By.cssSelector("p.getall-selected");

	
	@BeforeClass	
	public void beforeClass() {

		report =  ExtentFactory.getInstance();


	}


	@Test
	public void SelectListDemo() throws Exception{

		test = report.createTest("selectOption TC", "sample test");
		test.log(Status.INFO,"Starting the test");
		test.info("TEST");


		Select dropdown = new Select(driver.findElement(clickDropdownList));
		dropdown.selectByVisibleText("Tuesday");
		result = driver.findElement(selectedValue).getText();
		AssertJUnit.assertEquals("Day selected :- Tuesday", result);
		test.pass("test completed and passed");
		report.flush();
		System.out.print(result);


	}

	@Test
	public void MultiSelectListDemo() {


		test = report.createTest("groupRadioButton TC", "sample test");
		test.log(Status.INFO,"Starting the test");
		test.info("TEST");

		// get all cities elements 
		List<WebElement> citiesElements = driver.findElements(multiSelect);
		// get the len of citiesElements
		int maxCities = citiesElements.size();
		// get random number
		Random random = new Random();
		int randomCity = random.nextInt(maxCities);
	     citiesElements.get(randomCity).click();
		driver.findElement(getAllSelected).click();
		result =  driver.findElement(getSelectedValue).getText();
	
		test.pass("test completed and passed");
		report.flush();


	}


}
