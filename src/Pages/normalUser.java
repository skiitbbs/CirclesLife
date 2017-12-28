package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class normalUser {
	
	public WebDriver pdriver;
	
	public normalUser(WebDriver driver) {
		pdriver = driver;
	}
	//Function starts from here.
	public void NormalUser() {
	
	pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	/*
	mobileDevice md = new mobileDevice(pdriver);
	md.fullpayment();
	*/
	pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
	
	pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
	//pdriver.findElement(By.xpath("//div[@class='btn btn-primary btn-lg btn-block Links']")).click();
	
	
	deliveryInfo di = new deliveryInfo(pdriver);
	di.DeliveyInfo();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	//pdriver.findElement(By.xpath("//a[@action='PUSH']")).click();
	pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
	
	//pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	}
	
	
	
}