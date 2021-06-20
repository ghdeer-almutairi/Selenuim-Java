package pages;

import java.io.File;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ExtentFactory {

	static ExtentSparkReporter spark;
	static ExtentReports extent;

	public static ExtentReports getInstance() {
		
		
		 spark = new ExtentSparkReporter("./Reports/extentReports.html");
		 extent = new ExtentReports();
         extent.attachReporter(spark);


		return extent;
        
        
	 
	}

	public static String CaptureScreen(WebDriver driver, String ImagesPath) {
	    TakesScreenshot oScn = (TakesScreenshot) driver;
	    File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
	    File oDest = new File(ImagesPath + ".jpg");
	    try {
	        FileUtils.copyFile(oScnShot, oDest);
	    } catch (IOException e) {
	        System.out.println(e.getMessage());
	    }
	    return ImagesPath + ".jpg";
	}
	
	
	
}