package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.InputFormsObjects;
import pages.SetConfigration;

public class InputForms {

	

    static WebDriver driver;
 
	

@BeforeTest
public void beforeTest() {
SetConfigration config = new SetConfigration(driver);
driver = config.setBrowserConfig();
}

@Test

public void InputFormsTC() throws Exception {
	
	
	InputFormsObjects obj = new InputFormsObjects(driver);
	
	obj.goToInputFormPage();
	obj.fillForm();
	
	
}




	
	
}
