package swiggy.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestCase_1 
{
	
	public static void writedatafromExcel(String sheetname ,String fieldname,String value) throws Exception {
		FileInputStream file =new FileInputStream("C:\\Users\\thisi\\OneDrive\\Desktop\\testfile.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(file);
		XSSFSheet sheet = w.getSheet(sheetname);
		int Firstrow =sheet.getFirstRowNum();
		XSSFRow row;
		row=sheet.getRow(Firstrow);
		XSSFCell cell;
		String columnname;
		for(int i=0;i<=5;i++) {
			columnname =sheet.getRow(i).getCell(0).getStringCellValue();
			if(columnname.trim().equalsIgnoreCase(fieldname)) {
				row =sheet.createRow(i);
				cell =row.createCell(0);
				cell.setCellValue(value);
				break;
			}
		
		}
		
		FileOutputStream fileout =new FileOutputStream("C:\\Users\\thisi\\OneDrive\\Desktop\\testfile.xlsx");
		w.write(fileout);
		fileout.close();
		
	}
	public static void main(String args[]) throws Exception {
		readdatafromExcel("Testsheet","Result","success");
		/*FileInputStream file =new FileInputStream("C:\\Users\\thisi\\OneDrive\\Desktop\\testfile.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(file);
		XSSFSheet sheet = w.getSheet("Testsheet");
		int Firstrow =sheet.getFirstRowNum();
		XSSFRow row;
		row=sheet.getRow(Firstrow);
		XSSFCell cell;
		String columnname;
		String value;
		for(int i=0;i<=row.getLastCellNum();i++) {
			columnname =sheet.getRow(0).getCell(i).getStringCellValue();
			if(columnname.trim().equalsIgnoreCase("Password")) {
				cell =sheet.createRow(1).getCell(i);
				cell.setCellValue("");
				
				//System.out.println(value);
				break;
			}
		
		}*/
	
		//Stepdefnition.read();
				/*FileInputStream file1 =new FileInputStream(System.getProperty("user.dir")+"//inputs//AllProperties.properties");
		Properties prop =new Properties();
		prop.load(file1);
		ArrayList<String> iteamlist = null;
		String s ="Lunch_item_";
		for(int i=1;i<=prop.size();i++) {
		boolean flag = prop.containsKey(s+i);
	    
	    if(flag==true) {
	    	iteamlist = new ArrayList<String>();
	    	iteamlist.add(prop.getProperty(s+i));
	    }
	    if(flag==false) {
	    	break;
	    }
	    System.out.println(flag);
		}
		System.out.println(iteamlist.size());
		System.out.println(iteamlist.get(0));
		System.out.println(iteamlist.get(1));*/
		
		
	
	
	}
	private static void readdatafromExcel(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}	
	
	
	
}
