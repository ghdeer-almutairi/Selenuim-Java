package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BootstrapDatePickersObjects;
import pages.SetConfigration;

public class BootstrapDatePickers {
	

	 static WebDriver driver;
 
	

@BeforeTest
public void beforeTest() throws InterruptedException {
SetConfigration config = new SetConfigration(driver);
driver = config.setBrowserConfig();
}


@Test

public void DropdownTC() throws Exception {

	BootstrapDatePickersObjects obj = new BootstrapDatePickersObjects(driver);



	obj.goToDatePickerPage();
	obj.selectTodayDate();
	obj.selecRandomStartEndDate();
	obj.selectNextDay();
	obj.selectPreviousDay();




}
}
