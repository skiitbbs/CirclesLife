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
	String kirkpass = data.getkirkpass();
	
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
	
	public void kirkLogin() {
		
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[1]")).sendKeys(email);
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[2]")).sendKeys(kirkpass);
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/button")).click(); 
		
		
	}
	

}
