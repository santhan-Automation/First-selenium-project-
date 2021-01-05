package swiggy.com;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass extends BaseClass{

public static void launch_Application(String url) throws Exception {

	driver.get(properties("Url"));
}
public static boolean elementispresent(By element) {
	
	if(driver.findElements(element).size()!=0) {
		return true;
	}else{
		return false;
	}
}
public static void Click(By element) {
	try {
	if(elementispresent(element) ==true) {
		driver.findElement(element).click();
	}
	}catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
}
public static void SendKeys(By element,String text) {
	try {
	if(elementispresent(element) ==true) {
		driver.findElement(element).sendKeys(text);
	}
	}catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
}
public static String getText(By element) {
	if(elementispresent(element) ==true) {
		return driver.findElement(element).getText();
	}else {
		return null;
	}
	
}
public static String getValue(By element) {
	if(elementispresent(element) ==true) {
		return driver.findElement(element).getAttribute("value");
	}else {
		return null;
	}
	
}
public static void implicitwait(int time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}
public static void WaitForelementLoad(By element,int time) {
	WebDriverWait wait = new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	
}

public static void selectelement(WebElement locator, String selecttype,String value) {
	
	Select s =new Select(locator);
	
	switch (selecttype) {
	case "Index":
		
	s.selectByIndex(Integer.parseInt(value));
	break;
	
	case "Visible text":
	s.selectByVisibleText(value);
	break;
	
	case "Value":
	s.selectByValue(value);
	break;

	default:
	 
	}

}

}
