package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

public class portInFlow {
	
WebDriver pdriver;
	
	public portInFlow(WebDriver driver) {
		pdriver = driver;
	}
	
	public void portin() {
		
		ExcelData data = new ExcelData();
		String portin = data.getportin();
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//div[@class='pocket-button']")).click();
		pdriver.findElement(By.xpath("//input[@type='number']")).sendKeys("82345670");
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/div[2]/div/div[1]/div/div/div[2]/div[5]/div/div/div[1]/div/div[1]/div")).click();
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/footer/div/div/div/a")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div/footer/div/div/div/div")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/footer/div/div/div/a")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		/*
		pdriver.findElement(By.xpath("//div[@class='default-phone']")).click();
		mobileDevice md = new mobileDevice(pdriver);
		md.fullpayment();
		*/
		
		deliveryInfo dp = new deliveryInfo(pdriver);
		dp.DeliveyInfo();
		
		pdriver.findElement(By.xpath("//*[@id=\"st-container\"]/div/div/div[2]/span/div/footer/div/div/div/div")).click();
		
	}

}
