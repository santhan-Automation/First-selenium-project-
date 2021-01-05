package swiggy.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record;

public class Stepdefnition extends BaseClass {

	public static void Login() throws Exception {
		UtilityClass.Click(Locators.Login);
		UtilityClass.implicitwait(10);
		UtilityClass.SendKeys(Locators.Phone, properties("phone"));
		UtilityClass.WaitForelementLoad(Locators.Submit, 10);
		UtilityClass.Click(Locators.Submit);
		UtilityClass.SendKeys(Locators.otp, "804208");
		UtilityClass.Click(Locators.veryfyOtp);
	}

	public static void openthebrowser() {
		if (BaseClass.get_OS_details().trim().contains("windows")) {
			BaseClass.Launch_browser("chrome");
			System.out.println("Application launched in windows and " + BaseClass.get_browser_details());
		} else if (BaseClass.get_OS_details().trim().contains("linux")) {
			BaseClass.Launch_browser("chrome");
			System.out.println("Application launched in linux and " + BaseClass.get_browser_details());
		} else {
			System.out.println();
		}
	}
	public static HashMap<String, String> readDataFromExcel(String sheetname ) {
		Fillo fillo =new Fillo();
		HashMap<String,String> hashmap =new HashMap<String,String>();
		try {
			Connection connection =fillo.getConnection(System.getProperty("user.dir")+"//inputs//Testconfiguration.xlsx");
			String strQuery="Select * from "+sheetname+" where Dishes_name ='Egg Biryani'";
			Recordset record =connection.executeQuery(strQuery);
			while (record.next()) {
				ArrayList<String> list =record.getFieldNames();
				for (String List : list) {
					
					hashmap.put(List, record.getField(List));
				}
				
				
			}
			System.out.println(hashmap);
			record.close();
			connection.close();
		
			
		} catch (FilloException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return hashmap;
		
	}
	public static void read() {
		HashMap<String, String> read = readDataFromExcel("Sheet1");
		System.out.println("");
		System.out.println(read.get("Breakfast"));
	}
	

}
