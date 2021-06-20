package pages;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class InputFormsObjects {
	
	  static WebDriver driver;
	  ExtentReports report;
	  ExtentTest test;

	
	
	public InputFormsObjects(WebDriver driver) {
		
		InputFormsObjects.driver = driver;
	}

	public void goToInputFormPage() {
		
		driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(5) > a")).click();
		
	}
	
	
	  public  void fillForm() throws IOException {
	
		

	   File file =  new File("/Users/ghadeer/eclipse-workspace/test/SeleniumJavaframework/excel/TestData.xls");
		FileInputStream inputStream = new FileInputStream(file);
		try(XSSFWorkbook myWorkBook = new XSSFWorkbook (inputStream)){
			 XSSFSheet sheet = myWorkBook.getSheetAt(0);
	
			

	 
		

		//Identify the WebElements for the student registration form
			WebElement firstName=driver.findElement(By.name("first_name"));
			WebElement lastName=driver.findElement(By.name("last_name"));
			WebElement email=driver.findElement(By.name("email"));
			WebElement mobile = driver.findElement(By.name("phone"));
			WebElement address =driver.findElement(By.name("address"));
			WebElement city =driver.findElement(By.name("city"));
			WebElement state =driver.findElement(By.name("state"));
			state.click();
			WebElement stateOption =driver.findElement(By.cssSelector("option:nth-child(2)"));
			stateOption.click();
			WebElement zipCode =driver.findElement(By.name("zip"));
			WebElement website =driver.findElement(By.name("website"));
			WebElement hosting =driver.findElement(By.cssSelector("input[type=radio][value='yes']"));
			hosting.click();
			WebElement description =driver.findElement(By.name("comment"));
			WebElement sendButton =driver.findElement(By.cssSelector(".btn.btn-default"));
			sendButton.click();
		



			//Enter the values read from Excel in firstname,lastname,mobile,email,address
			firstName.sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
			lastName.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
			email.sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
			mobile.sendKeys(sheet.getRow(1).getCell(3).getStringCellValue());
			address.sendKeys(sheet.getRow(1).getCell(4).getStringCellValue());
			city.sendKeys(sheet.getRow(1).getCell(5).getStringCellValue());
			zipCode.sendKeys(sheet.getRow(1).getCell(6).getRawValue());
			website.sendKeys(sheet.getRow(1).getCell(7).getStringCellValue());
			description.sendKeys(sheet.getRow(1).getCell(8).getStringCellValue());
		
	}
	
		

		}
	
	
	  }	
  
	  
	  
	  
		
