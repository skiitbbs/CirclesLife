package elitecoreElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

public class crestelLogIn {
	
	public WebDriver pdriver;
	
	ExcelData data = new ExcelData();
	String email = data.getadminemail();
	String pass = data.getelitepass();
	
	public crestelLogIn(WebDriver driver) {
		pdriver = driver;
	}
	
	public void loginToCrestel() {
		pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath(crestelui.email)).sendKeys(email);
		pdriver.findElement(By.xpath(crestelui.pass)).sendKeys(pass);
		pdriver.findElement(By.xpath(crestelui.loginbutton)).click();
		
		int size = pdriver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Number of fram in this page is: " +size);
	
	}

}
