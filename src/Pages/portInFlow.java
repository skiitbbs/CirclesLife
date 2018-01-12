package Pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

public class portInFlow {
	
	WebDriver pdriver;
	public String portin;
	
	public portInFlow(WebDriver driver) {
		pdriver = driver;
	}
	
	public void portin() {
		/*
		ExcelData data = new ExcelData();
		String portin = data.getportin();
		*/
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Random rn = new Random();
		this.portin = Integer.toString(rn.nextInt(90000001) + 9000000);
		System.out.println("this is random number: " + portin);
		
		pdriver.findElement(By.xpath("//div[@class='pocket-button']")).click(); //click on 
		pdriver.findElement(By.xpath("//input[@type='number']")).sendKeys(portin);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\"number-select-container\"]/div[2]/div/div[1]/div/div/div[2]/div[5]/div/div/div[1]/div/div[1]/div")).click();
		pdriver.findElement(By.xpath("//*[@id=\"number-select-container\"]/div[2]/div/div[1]/div/div/div[2]/div[7]/div/div/div[1]/div/div[1]/div")).click();
		pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
		/*
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/footer/div/div/div/a")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div/footer/div/div/div/div")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/footer/div/div/div/a")).click();
		*/
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
		pdriver.findElement(By.xpath("//div[@class='btn btn-primary btn-lg btn-block Links']")).click();
		pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
		
		deliveryInfo dp = new deliveryInfo(pdriver);
		dp.DeliveyInfo();
		
		//pdriver.findElement(By.xpath("//*[@id=\"st-container\"]/div/div/div[2]/span/div/footer/div/div/div/div")).click();
		
	}

}
