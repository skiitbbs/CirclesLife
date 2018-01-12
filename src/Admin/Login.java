package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

public class Login {
	
	WebDriver pdriver;
	
	public Login(WebDriver driver) {
		pdriver = driver;
	}
	
	ExcelData data = new ExcelData();
	String email = data.getadminemail();
	String pass = data.getadminpass();
	String ppass = data.getvulcanpass();
	
	public void login() {
		
		pdriver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys(email);
		pdriver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		pdriver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	public void vulcanlogin() {
		
		pdriver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys(email);
		pdriver.findElement(By.xpath("//input[@type='password']")).sendKeys(ppass);
		pdriver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	

}
