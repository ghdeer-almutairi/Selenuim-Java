package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import pages.SetConfigration;


public class PropertiesFile {
	
  static Properties prop = new Properties(); 
  

	public static void main(String[] args) {
		
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
		
	}

	public static void readPropertiesFile() {
		
		
		try {
			
			InputStream input = new FileInputStream("/Users/ghadeer/eclipse-workspace/test/SeleniumJavaframework/src/test/java/config/config.properties");
		    prop.load(input);
			System.out.println(prop.getProperty("browser"));
			SetConfigration.browser = prop.getProperty("browser");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile() {
		
		try {
			OutputStream  output = new FileOutputStream("/Users/ghadeer/eclipse-workspace/test/SeleniumJavaframework/src/main/java/config/config.properties");
			prop.setProperty("browser", "Chrome");
			prop.store(output, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
