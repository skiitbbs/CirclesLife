package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import lib.uielements;

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
		
		pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
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
		
		pdriver.findElement(By.xpath(uielements.selectmobile)).click(); //Mobile Selection.
		pdriver.findElement(By.xpath(uielements.selectmobilecolour)).click(); //color selection.
		
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		pdriver.findElement(By.xpath(uielements.selectmobilememory)).click(); //Memory selection
		pdriver.findElement(By.xpath(uielements.selectfullamount)).click(); //Payment Selection
		System.out.println("Full payment Device has been selected.");
		
	}
	
	public void installment() {
		
		/*
		 * Below lines of code is going to select installment for phone.
		 * 
		*/
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath(uielements.selectmobile)).click(); //Mobile Selection.
		pdriver.findElement(By.xpath(uielements.selectmobilecolour)).click(); //color selection.
		
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		pdriver.findElement(By.xpath(uielements.selectmobilememory)).click(); //Memory selection
		pdriver.findElement(By.xpath(uielements.selectinstallment)).click(); //Payment Selection
		System.out.println("Full payment Device has been selected.");
		
		System.out.println("Installment payment Device has been selected.");
		
	}
	
	public void splitpayment() {
		
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath(uielements.selectmobile)).click(); //Mobile Selection.
		pdriver.findElement(By.xpath(uielements.selectmobilecolour)).click(); //color selection.
		
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		pdriver.findElement(By.xpath(uielements.selectmobilememory)).click(); //Memory selection
		pdriver.findElement(By.xpath(uielements.selectsplit)).click(); //Payment Selection
		System.out.println("Full payment Device has been selected.");
		
		System.out.println("Split payment Device has been selected.");
		
	}

}
