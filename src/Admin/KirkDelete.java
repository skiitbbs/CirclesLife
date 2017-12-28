package Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

public class KirkDelete {

	public WebDriver pdriver;
	ExcelData data = new ExcelData();
	
	String email = data.getadminemail();
	String pass = data.getrikerpass();
	
	/*
	String Auth = data.getauthurl();
	String url = data.getstagurl();
	String borgurl = data.getborgurl();
	String url = data.getprodurl();
	String vulcurl = data.getvulcanurl();
	String rikerurl = data.getrikerurl();
	String kirkurl = data.getkirkurl();
	
	*/
	
	public KirkDelete(WebDriver driver) {
		pdriver = driver;
	}
	
	public void kirkdelete() {
		
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[1]")).sendKeys(email);
		//pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[2]")).sendKeys(pass;
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[2]")).sendKeys(pass);
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/button")).click(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\"nav-accordion\"]/li[1]/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\"nav-accordion\"]/li[1]/ul/li[2]/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		pdriver.findElement(By.xpath("//button[@id='ingressfailed']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void delete() {
		pdriver.findElement(By.cssSelector("[id^='trash']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
