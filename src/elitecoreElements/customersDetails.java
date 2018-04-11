package elitecoreElements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customersDetails {
	
	XSSFWorkbook wb;
	XSSFSheet sheet4;
	File src;
	FileOutputStream fout;
	public WebDriver pdriver;
	public WebDriverWait wait;
	HashMap<String, String> hmap;
	Set set;
	Iterator iterator;
	
	String customername;
	String creationdate;
	String customeremail;
	String customeradd;
	String customerstatus;
	String sinumber;
	String banumber;
	String sanumber;
	String canumber;
	
	public customersDetails(WebDriver driver) {
		pdriver = driver;
		wait= new WebDriverWait(driver, 20);
	}
	
	public void getCustomerInformation() {
		
		pdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		customerSearch cs = new customerSearch(pdriver); //search the customer.
		cs.gotoCustomerPage();
		
		//getting Customer details here as Text.
		customername = pdriver.findElement(By.xpath(crestelui.customername)).getText();
		creationdate = pdriver.findElement(By.xpath(crestelui.creationdate)).getText();
		customeremail = pdriver.findElement(By.xpath(crestelui.customeremail)).getText();
		customeradd = pdriver.findElement(By.xpath(crestelui.customeradd)).getText();
		customerstatus = pdriver.findElement(By.xpath(crestelui.status)).getText();
		
		pdriver.findElement(By.xpath(crestelui.plannamelink)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(crestelui.sinumber)));

		
		sinumber = pdriver.findElement(By.xpath(crestelui.sinumber)).getText();
		banumber = pdriver.findElement(By.xpath(crestelui.banumber)).getText();
		sanumber = pdriver.findElement(By.xpath(crestelui.sanumber)).getText();
		canumber = pdriver.findElement(By.xpath(crestelui.canumber)).getText();
		
		hmap = new HashMap<String, String>();
		hmap.put("email", customeremail);
		hmap.put("addresss", customeradd);
		hmap.put("status", customerstatus);
		hmap.put("sinumber", sinumber);
		hmap.put("banumber", banumber);
		hmap.put("sanumber", sanumber);
		hmap.put("canumber", canumber);  
		set = hmap.entrySet();
		iterator = set.iterator();

	}
	
	public void writeExcel() {
		try {
			src = new File("/Users/sumitkumar/git/CirclesLife/src/Test Data.xlsx");
		
			FileInputStream fis = new FileInputStream(src);
		
			wb = new XSSFWorkbook(fis);
		
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} //Try catch surrounding is basically used to avoid exceptional error.
	
	
			sheet4 = wb.getSheetAt(4);
			int r = 0, c = 0;
			
			set = hmap.entrySet();
			iterator = set.iterator();
			
		
			while(iterator.hasNext()) {
				
				Map.Entry mentry = (Map.Entry)iterator.next();
				
				System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
				System.out.println(mentry.getValue().toString());
				
				Row row = sheet4.getRow(r);
				if( row == null) {
					row = sheet4.createRow(r);
				}
				
				Cell cell = row.getCell(c);
				if(cell == null) {
					cell = row.createCell(c);
				}
				
				Cell cellValue = row.getCell(c+1);
				if(cellValue == null) {
					cellValue = row.createCell(c+1);
				}
					
				cell.setCellValue(mentry.getKey().toString());
				cellValue.setCellValue(mentry.getValue().toString());
				
				r++;
			}
			
			
			System.out.println("Stored value = "+ "test");

			try {
				fout = new FileOutputStream(src);
				wb.write(fout);
				wb.close(); 
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} //Try catch surrounding is basically used to avoid exceptional error.
	}
	
}
