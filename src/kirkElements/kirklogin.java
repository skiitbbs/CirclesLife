package kirkElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

	public class kirklogin {
	
		public WebDriver pdriver;
	
		ExcelData data = new ExcelData();
		String email = data.getadminemail();
		String pass = data.getkirkpass();
	
		public kirklogin(WebDriver driver) {
			pdriver = driver;
		}
		
		public void logintokirk() {
			pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			pdriver.findElement(By.xpath(kirkui.email)).sendKeys(email);
			pdriver.findElement(By.xpath(kirkui.pass)).sendKeys(pass);
			pdriver.findElement(By.xpath(kirkui.loginbutton)).click();
			
		}

}
