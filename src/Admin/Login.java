package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelData;

public class Login {
	
	WebDriver pdriver;
	
	public Login(WebDriver driver) {
		pdriver = driver;
	}
	
	public void login() {
		
		ExcelData data = new ExcelData();
		String email = data.getadminemail();
		String pass = data.getadminpass();
		
		/*
		ExcelConfig excel = new ExcelConfig("/Users/sumitkumar/eclipse-workspace/CirclesLife/src/Test Data.xlsx");
		
		String email = excel.getData(0, 1, 3);
		String pass = excel.getData(0, 2, 3);
		*/
		
		pdriver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys(email);
		pdriver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		pdriver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}
