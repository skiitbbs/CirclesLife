package elitecoreElements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class customersDetails {
	XSSFWorkbook wb;
	XSSFSheet sheet4;
	File src;
	FileOutputStream fout;
	public WebDriver pdriver;
	
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
	}
	
	public void getCustomerInformation() {
		
		pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		String newLine = System.getProperty("line.separator");
		
		customerSearch cs = new customerSearch(pdriver);
		cs.gotoCustomerPage();
		
		customername = pdriver.findElement(By.xpath(crestelui.customername)).getText();
		creationdate = pdriver.findElement(By.xpath(crestelui.creationdate)).getText();
		String customeremail = pdriver.findElement(By.xpath(crestelui.customeremail)).getText();
		String customeradd = pdriver.findElement(By.xpath(crestelui.customeradd)).getText();
		String customerstatus = pdriver.findElement(By.xpath(crestelui.status)).getText();
		
		pdriver.findElement(By.xpath(crestelui.plannamelink)).click();
		
		String sinumber = pdriver.findElement(By.xpath(crestelui.sinumber)).getText();
		String banumber = pdriver.findElement(By.xpath(crestelui.banumber)).getText();
		String sanumber = pdriver.findElement(By.xpath(crestelui.sanumber)).getText();
		String canumber = pdriver.findElement(By.xpath(crestelui.canumber)).getText();
		
		System.out.println("Customer Name: " +customername+ newLine + "Customer Created Date: " + creationdate + newLine+ "Customer Email: " + customeremail);
		System.out.println("Customer Address: "+customeradd+ newLine+ "Customer Status: "+customerstatus);
		System.out.println("SI number: "+sinumber+newLine+ "SA Number: "+sanumber+newLine+"BA Number: "+banumber+newLine+"CA number: "+canumber);
		
	}
	
	public void writeinexcel() {
		
		try {
			src = new File("/Users/sumitkumar/git/CirclesLife/src/Test Data.xlsx");
		
			FileInputStream fis = new FileInputStream(src);
		
			wb = new XSSFWorkbook(fis);
		
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} //Try catch surrounding is basically used to avoid exceptional error.
		
			for (int i =0; i<9; i++) {
	
			sheet4 = wb.getSheetAt(2);
			sheet4.getRow(6).createCell(3).setCellValue(customeremail);
			System.out.println("Stored value = "+ customeremail);
			
			}

			try {
				fout = new FileOutputStream(src);
				wb.write(fout);
				wb.close(); 
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} //Try catch surrounding is basically used to avoid exceptional error.

		
	}

}
