package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class mobileDevice {
	
	WebDriver pdriver;
	
	public mobileDevice(WebDriver driver) {
		pdriver = driver;
	}
		
	public void before() {
		
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//div[@class='default-phone']")).click(); //Website device link
		
	}
	
	public void after() {
		
		pdriver.findElement(By.xpath("//div[@class='btn btn-primary btn-lg btn-block Links']")).click();
		//pdriver.findElement(By.xpath("//a[@action='PUSH']")).click(); //Process to Order
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click(); //Pre-Checkout page

	}
	
	public void fullpayment() {
		
		/*Below line of code is going to select a device and adding in to order.
		 * Device: Samsung Galaxy s6 and Full Payment.
		*/
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//pdriver.findElement(By.xpath("//div[@class='default-phone']")).click(); //Website device link
		pdriver.findElement(By.xpath("//span[@class='text-primary']")).click(); //Mobile Selection.
		pdriver.findElement(By.xpath("//div[@class='col-xs-15'][1]")).click(); //color selection.
		
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		pdriver.findElement(By.xpath("//div[@class='col-xs-4']")).click(); //Memory selection
		pdriver.findElement(By.xpath("//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div/div/div[5]/div[2]/div/div[1]/div")).click(); //Payment Selection
		System.out.println("Full payment Device has been selected.");
		
	}
	
	public void installment() {
		
		/*
		 * Below lines of code is going to select installment for phone.
		 * 
		*/
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//span[@class='text-primary']")).click(); //Mobile Selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[3]/div/div[2]/div")).click(); //color selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div/div/div")).click(); //Memory selection
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[5]/div[2]/div/div[2]/div")).click(); //Payment selection
		
		System.out.println("Installment payment Device has been selected.");
		
	}
	
	public void splitpayment() {
		
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//span[@class='text-primary']")).click(); //Mobile Selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[3]/div/div[2]/div")).click(); //color selection.
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div/div/div")).click(); //Memory selection
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div")).click(); //Payment Selection
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[6]/div[4]/div[2]/div[1]/div[2]/div/div/span")).click();
		
		System.out.println("Split payment Device has been selected.");
		
	}

}
