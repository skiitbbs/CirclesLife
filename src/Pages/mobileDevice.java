package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mobileDevice {
	
	WebDriver pdriver;
	
	public mobileDevice(WebDriver driver) {
		pdriver = driver;
	}
	
	public void fullpayment() {
		
		/*Below line of code is going to select a device and adding in to order.
		 * Device: Samsung Galaxy s6 and Full Payment.
		*/
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//div[@class='default-phone']")).click(); //Website device link
		pdriver.findElement(By.xpath("//span[@class='text-primary']")).click(); //Mobile Selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[3]/div/div[2]/div")).click(); //color selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div/div/div")).click(); //Memory selection
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[5]/div[2]/div/div[1]/div")).click(); //Payment Selection
		pdriver.findElement(By.xpath("//a[@action='PUSH']")).click(); //Process to Order
	}
	
	public void installment() {
		
		/*
		 * Below lines of code is going to select installment for phone.
		 * 
		*/
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//div[@class='default-phone']")).click(); //Website device link
		pdriver.findElement(By.xpath("//span[@class='text-primary']")).click(); //Mobile Selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[3]/div/div[2]/div")).click(); //color selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div/div/div")).click(); //Memory selection
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[5]/div[2]/div/div[2]/div")).click(); //Payment selection
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//span[@style='font-size: 16px; font-weight: 300;']
		//pdriver.findElement(By.xpath("//span[@style='font-size: 16px; font-weight: 300;']")).click();
		pdriver.findElement(By.cssSelector("#st-container > div > div > div:nth-child(2) > span > div > div:nth-child(2) > div > div > div > div:nth-child(8) > div:nth-child(3) > div.container-fluid > div.row > div:nth-child(1) > div")).click(); //Installment Month selection
		pdriver.findElement(By.xpath("//a[@action='PUSH']")).click();
		
	}
	
	public void splitpayment() {
		
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//div[@class='default-phone']")).click(); //Website device link
		pdriver.findElement(By.xpath("//span[@class='text-primary']")).click(); //Mobile Selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[3]/div/div[2]/div")).click(); //color selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div/div/div")).click(); //Memory selection
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div")).click(); //Payment Selection
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[6]/div[4]/div[2]/div[1]/div[2]/div/div/span")).click();
		pdriver.findElement(By.xpath("//a[@action='PUSH']")).click(); //Process to Order
		
	}

}
