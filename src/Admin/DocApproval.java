package Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

//import lib.ExcelData;

public class DocApproval {
	
	WebDriver pdriver;
	public String order;
	
	public DocApproval(WebDriver driver) {
		pdriver = driver;
	}
	
	public void docapprove() {
		
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		ExcelData data = new ExcelData();
		String order = data.getorderno();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\"pjax-container\"]/div/div/div[1]/ul/li[5]/a")).click();
		//pdriver.findElement(By.xpath("//*[@id=\'orders_table\']/table/thead/tr/th[2]/a")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//input[@placeholder='Order Ref']")).sendKeys(order);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\"orders_table\"]/table/tbody/tr/td[12]/button")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//button[@name='approve']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Alert simpleAlert = pdriver.switchTo().alert();
		simpleAlert.accept();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
