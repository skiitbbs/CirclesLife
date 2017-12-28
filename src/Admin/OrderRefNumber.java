package Admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderRefNumber {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	File src;
	FileOutputStream fout;
	public WebDriver pdriver;
	public String order;
	int count ;
	
	public OrderRefNumber(WebDriver driver) {
		pdriver = driver;
		
	}
	
	public String orderRefnumber() {
			
				pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				//System.out.println("Before code start.");
				//String OrderRef = pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div/div[2]/div/div/div/div/div[4]/div/span[2]")).getText();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String order = pdriver.findElement(By.cssSelector(".row:nth-child(2) .col-xs-12 div div div div:nth-child(4) div span:nth-child(2)")).getText();
				//String order = pdriver.findElement(By.xpath("//div[@class='col-xs-6'][1]")).getText();
				System.out.println("Stored value = "+ order);
				//this.order = order;
				
			
		return order;
	}
	
	public void writeOrder() {
		
		try {
			src = new File("/Users/sumitkumar/git/CirclesLife/src/Test Data.xlsx");
			
			FileInputStream fis = new FileInputStream(src);
			
			 wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
		
			// set order ref number
			String orderId = orderRefnumber();
		
			sheet1 = wb.getSheetAt(2);
			sheet1.getRow(3).createCell(3).setCellValue(orderId);
			System.out.println("Stored value = "+ orderId);
	
			try {
					fout = new FileOutputStream(src);
					wb.write(fout);
					wb.close(); 
			} catch (Exception e) {
			System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
	
	//return Order;
		
	}	
}

