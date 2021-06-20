package test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import pages.RadioButtonsObjects;
import pages.SetConfigration;



public class RadioButtonsTestCases {
	

    static WebDriver driver;
 
	

@BeforeTest
public void beforeTest() {
SetConfigration config = new SetConfigration(driver);
driver = config.setBrowserConfig();
}


@Test
public void radioButtonsTest() throws Exception {
	
	RadioButtonsObjects obj = new RadioButtonsObjects(driver);

    obj.beforeClass();
    obj.goToRadioButtonsPage();
    obj.selectOption();
    obj.groupRadioButton();
    

}

/*
@AfterTest
public  void runTest() {
	

	
	
}
*/


}