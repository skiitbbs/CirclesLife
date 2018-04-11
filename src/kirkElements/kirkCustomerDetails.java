package kirkElements;

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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class kirkCustomerDetails {
	
		XSSFWorkbook wb;
		XSSFSheet sheet4;
		File src;
		FileOutputStream fout;
		public WebDriver pdriver;
		HashMap<String, String> hmap;
		Set set;
		Iterator iterator;
	
		public kirkCustomerDetails(WebDriver driver) {
		pdriver = driver;
	}
		
		public void gotoCustomertab() {
			
			pdriver.findElement(By.xpath(kirkui.navigationtocustomer)).click();
			pdriver.findElement(By.xpath(kirkui.selectcustomer)).click();
			pdriver.findElement(By.xpath(kirkui.enternumber)).sendKeys("87423620");
			pdriver.findElement(By.xpath(kirkui.enternumber)).sendKeys(Keys.RETURN);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void getkirkcustomerdetails() {
			pdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String newLine = System.getProperty("line.separator");
			
			String canumber = pdriver.findElement(By.xpath(kirkui.canumber)).getText();
			String banumber = pdriver.findElement(By.xpath(kirkui.banumber)).getText();
			String sanumber = pdriver.findElement(By.xpath(kirkui.sanumber)).getText();
			String sinumber = pdriver.findElement(By.xpath(kirkui.sinumber)).getText();
			String mobilenumber = pdriver.findElement(By.xpath(kirkui.mobilenumber)).getText();
			String customername = pdriver.findElement(By.xpath(kirkui.cacustomername)).getText();
			String customeremail = pdriver.findElement(By.xpath(kirkui.cacustomeremail)).getText();
			String customerdob = pdriver.findElement(By.xpath(kirkui.cacustomerdob)).getText();
			String customeridtype = pdriver.findElement(By.xpath(kirkui.cacustomeridtype)).getText();
			String customeridnumber = pdriver.findElement(By.xpath(kirkui.cacustomeridnumber)).getText();
			String bacustomername = pdriver.findElement(By.xpath(kirkui.bacustomername)).getText();
			String bacustomeremail = pdriver.findElement(By.xpath(kirkui.bacustomeremail)).getText();
			String customeradd1 = pdriver.findElement(By.xpath(kirkui.bacustomeraddline1)).getText();
			String customeradd2 = pdriver.findElement(By.xpath(kirkui.bacustomeraddline2)).getText();
			String customercity = pdriver.findElement(By.xpath(kirkui.bacustomercity)).getText();
			String customercountry = pdriver.findElement(By.xpath(kirkui.bacustomercountry)).getText();
			String customerpincode = pdriver.findElement(By.xpath(kirkui.bacustomerpincode)).getText();
			String sicustomername = pdriver.findElement(By.xpath(kirkui.sicustomername)).getText();
			String sicustomeremail = pdriver.findElement(By.xpath(kirkui.sicustomeremail)).getText();
			String checkoutdate = pdriver.findElement(By.xpath(kirkui.sicustomercheckoutdate)).getText();
			String planswitchdate = pdriver.findElement(By.xpath(kirkui.sicustomerplanactivation)).getText();
			String earliestterm = pdriver.findElement(By.xpath(kirkui.sicustomerearliesttermination)).getText();
			String roamingcap = pdriver.findElement(By.xpath(kirkui.sicustomerroamingcap)).getText();
			String orderref = pdriver.findElement(By.xpath(kirkui.sicustomerorderref)).getText();
			String refcodeused = pdriver.findElement(By.xpath(kirkui.sicustomerrefcode)).getText();
			
			hmap = new HashMap<String, String>();
			
			hmap.put("sinumber", sinumber);
			hmap.put("banumber", banumber);
			hmap.put("sanumber", sanumber);
			hmap.put("canumber", canumber);
			hmap.put("mobilenumber", mobilenumber);
			hmap.put("customeremail", customeremail);
			hmap.put("customername", customername);
			hmap.put("customerdob", customerdob);
			hmap.put("customeridtype", customeridtype);
			hmap.put("customeridnumber", customeridnumber);
			hmap.put("bacustomername", bacustomername);
			hmap.put("bacustomeremail", bacustomeremail);
			hmap.put("customeradd1", customeradd1);
			hmap.put("customeradd2", customeradd2);
			hmap.put("customercity", customercity);
			hmap.put("customercountry", customercountry);
			hmap.put("customerpincode", customerpincode);
			hmap.put("sicustomername", sicustomername);
			hmap.put("sicustomeremail", sicustomeremail);
			hmap.put("checkoutdate", checkoutdate);
			hmap.put("planswitchdate", planswitchdate);
			hmap.put("earliestterm", earliestterm);
			hmap.put("roamingcap", roamingcap);
			hmap.put("orderref", orderref);
			hmap.put("refcodeused", refcodeused);
			
			
			set = hmap.entrySet();
			iterator = set.iterator();
			
//			System.out.println("CA Number: " + canumber + newLine + "BA Number: "+ banumber + newLine + "SA Number: " + sanumber + newLine+ "SI Number: " + sinumber);
//			System.out.println("Mobile Number: " + mobilenumber + newLine);
//			System.out.println("CA Name: " + customername + newLine + "SI name: " + sicustomername + newLine + "BA Name: " + bacustomername + newLine);
//			System.out.println("Customer ID typ: " + customeridtype + newLine + "Customer ID No: "+ customeridnumber + newLine + "Customer DOB: " + customerdob + newLine);
//			System.out.println("BA email: " + bacustomeremail+ newLine + "CA Email: "+ customeremail + newLine + "SI email: "+ sicustomeremail + newLine );
//			System.out.println("Address line 1: "+ customeradd1 + newLine + "Address line 2: " + customeradd2);
//			System.out.println("City: " + customercity + ", Country: "+ customercountry + ", PinCode: " + customerpincode + newLine);
//			System.out.println("Plan Switch date: " + planswitchdate + newLine + "Earliest Term date: "+ earliestterm + newLine + "Checkout Date: " + checkoutdate);
//			System.out.println("Roaming Cap: " + roamingcap + newLine + "Order ref No: "+ orderref + newLine + "Ref Code used: " + refcodeused + newLine);
//			
		}
	
		public void cutomersAddOnDetails() {
		
		pdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String newLine = System.getProperty("line.separator");
		
		int rowCount= pdriver.findElements(By.xpath(kirkui.activeaddontable)).size();
		System.out.println(newLine);
		System.out.println("Total number of AddOns present for the Customer is " +rowCount + ".");
		
		int j = 0;
		for(int i = 0; i <rowCount; i++) {
			
		
			WebElement addOns = pdriver.findElement(By.xpath("//*[@id='showGeneralsActive']/tbody/tr["+(j+1)+"]/td[1]"));
			String addOn = addOns.getText();
			j++;
			
			System.out.println(j+ " AddOn is: " + addOn);
			
		}
		
		int nextPlanCount = pdriver.findElements(By.xpath(kirkui.futureaddontable)).size();
		System.out.println(newLine);
		System.out.println("Total Number of AddOns for the Next Month is " +nextPlanCount+".");
		int k = 0;
		for (int i=0; i<nextPlanCount; i++) {
			
			WebElement nextAddons = pdriver.findElement(By.xpath("//*[@id=\"showGeneralsFuture\"]/tbody/tr["+(k+1)+"]/td[1]"));
			String nextAddon = nextAddons.getText();
			k++;
			
			System.out.println(k + " Next Plan is: " +nextAddon);
			
		}
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
				int r = 0, c = 3;
				
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
		
		public String getotp() {
			
			String otp;
			otp = pdriver.findElement(By.xpath("//table[@id='pinNumbersTable']/tbody/tr/td[2]")).getText();
			return otp;
			
		}

}
