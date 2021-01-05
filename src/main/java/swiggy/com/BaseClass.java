package swiggy.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass 

{
	static WebDriver driver ;
   
	public static void Launch_browser(String browser_name) {
		if(browser_name.trim().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser_name.trim().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver = new ChromeDriver();
		}else if(browser_name.trim().contains("ie")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			driver = new ChromeDriver();
		}
	}
	
	public static String properties(String value) throws Exception {
			FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"//inputs//AllProperties.properties");
			Properties prop =new Properties();
			prop.load(file);
			return prop.getProperty(value);
		
	}
	public static String get_browser_details() {
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		 String Browserdetails  = caps.getBrowserName() +"="+caps.getVersion();
		// System.out.println(Browserdetails);
		 return Browserdetails;
		
	}
	public static String get_OS_details() {
		 String OSdetails  = System.getProperty("os.name").toLowerCase();
		// System.out.println(OSdetails);
		 return OSdetails;
		
	}
	
}
