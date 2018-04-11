package kirkElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

	public class kirklogin {
	
		public WebDriver pdriver;
	
		ExcelData data = new ExcelData();
		String email = data.getadminemail();
		String pass = data.getkirkpass();
		String rpass = data.getrikerpass();
	
		public kirklogin(WebDriver driver) {
			pdriver = driver;
		}
		
		public void logintokirk() {
			pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			pdriver.findElement(By.xpath(kirkui.email)).sendKeys(email);
			pdriver.findElement(By.xpath(kirkui.pass)).sendKeys(pass);
			pdriver.findElement(By.xpath(kirkui.loginbutton)).click();
			
		}
		
		public void logintoriker() {
			pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			pdriver.findElement(By.xpath(kirkui.email)).sendKeys(email);
			pdriver.findElement(By.xpath(kirkui.pass)).sendKeys(rpass);
			pdriver.findElement(By.xpath(kirkui.loginbutton)).click();
			
		}
		
		public String getotp() {
			
			String otp;
			
			pdriver.findElement(By.xpath(kirkui.navigationtocustomer)).click();
			pdriver.findElement(By.xpath(kirkui.selectcustomer)).click();
			pdriver.findElement(By.xpath(kirkui.enternumber)).sendKeys("87482333");
			pdriver.findElement(By.xpath(kirkui.enternumber)).sendKeys(Keys.RETURN);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			otp = pdriver.findElement(By.xpath("//table[@id='pinNumbersTable']/tbody/tr/td[2]")).getText();
			return otp;
			
		}

}
