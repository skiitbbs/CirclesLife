package Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelConfig;
import lib.ExcelData;

public class DocApproval {
	
	WebDriver pdriver;
	
	public DocApproval(WebDriver driver) {
		pdriver = driver;
	}
	
	public void docapprove() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ExcelData data = new ExcelData();
		String order = data.getorderno();
		
		
		pdriver.findElement(By.xpath("//*[@id=\'pjax-container\']/div/div/div[1]/ul/li[5]/a")).click();
		//pdriver.findElement(By.xpath("//*[@id=\'orders_table\']/table/thead/tr/th[2]/a")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//input[@placeholder='Order Ref']")).sendKeys(order);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\'orders_table\']/table/tbody/tr/td[12]/button")).click();
		pdriver.findElement(By.xpath("//button[@name='approve']")).click();
		
		Alert simpleAlert = pdriver.switchTo().alert();
		simpleAlert.accept();
		
	}

}
