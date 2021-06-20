package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetConfigration {
	
	public static String browser;
    static WebDriver driver;
  

	public SetConfigration(WebDriver driver) {
		
		SetConfigration.driver = driver;
	}
	
	public  WebDriver setBrowserConfig() {
		
	 PropertiesFile.readPropertiesFile();

		
	if (browser.contains("chrome")) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	}

	driver.get("https://www.seleniumeasy.com/test/");

	   return driver;
	
	}

}
