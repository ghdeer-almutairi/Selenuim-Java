package pages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;





public class RadioButtonsObjects {


	WebDriver driver;
	static String result;
	ExtentReports report;
	ExtentTest test;



	public RadioButtonsObjects( WebDriver driver) {

		this.driver = driver;
	}


	public void goToRadioButtonsPage() {
		
		driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("ul#treemenu  ul > li:nth-of-type(1) > ul > li:nth-of-type(3) > a")).click();
		
	}


	static By clickMaleOption = By.cssSelector("label:nth-of-type(1) > input[name='optradio']");
	static By getCheckedValue = By.cssSelector("button#buttoncheck");
	static By radioButtonResult = By.cssSelector("p[class='radiobutton']");
	static By clickMaleSex = By.cssSelector("label:nth-of-type(1) > input[name='gender']");
	static By selectAgeGroup = By.cssSelector("label:nth-of-type(3) > input[name='ageGroup']");
	static By clickGetValues = By.cssSelector(".panel-body > .btn.btn-default");
	static By groupRadioButtonsResult = By.cssSelector("p[class='groupradiobutton']");




	@BeforeClass	
	public void beforeClass() {

		report =  ExtentFactory.getInstance();


	}


	@Test

	public void selectOption () throws Exception{



		test = report.createTest("selectOption TC", "sample test");
		test.log(Status.INFO,"Starting the test");
		test.info("TEST");


		driver.findElement(clickMaleOption).click();
		driver.findElement(getCheckedValue).click();
		result = driver.findElement(radioButtonResult).getText();
		AssertJUnit.assertEquals("Radio button 'Male' is checked", result);
		test.pass("test completed and passed");
		report.flush();
		System.out.print(result);


	}

	@Test
	public void groupRadioButton () {


		test = report.createTest("groupRadioButton TC", "sample test");
		test.log(Status.INFO,"Starting the test");
		test.info("TEST");

		driver.findElement(clickMaleSex).click();
		driver.findElement(selectAgeGroup).click();
		driver.findElement(clickGetValues).click();
		result = driver.findElement(groupRadioButtonsResult).getText();
		System.out.print("\n" + result);
		Assert.assertEquals("Sex : Male" +"\n"+ "Age group: 15 - 50", result);
		test.pass("test completed and passed");
		report.flush();


	}




}

