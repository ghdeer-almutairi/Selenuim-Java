package test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DropdownObjects;
import pages.SetConfigration;

public class DropdownList {
	
	

    static WebDriver driver;
 
	

@BeforeTest
public void beforeTest() throws InterruptedException {
SetConfigration config = new SetConfigration(driver);
driver = config.setBrowserConfig();
}


@Test

public void DropdownTC() throws Exception {

	DropdownObjects obj = new DropdownObjects(driver);
	
    obj.beforeClass();
	obj.goToDropdownPage();
	obj.SelectListDemo();
    obj.MultiSelectListDemo();
	
}

}