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
	
	pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div/footer/div/div/div/a")).click();
	pdriver.findElement(By.xpath("//a[@action='PUSH']")).click();
	
	deliveryInfo di = new deliveryInfo(pdriver);
	di.DeliveyInfo();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/footer/div/div/div/div")).click();
	
	}
	
	
	
}
