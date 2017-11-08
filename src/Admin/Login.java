package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.ExcelConfig;

public class Login {
	
	WebDriver pdriver;
	
	public Login(WebDriver driver) {
		pdriver = driver;
	}
	
	public void login() {
		
		ExcelConfig excel = new ExcelConfig("/Users/sumitkumar/eclipse-workspace/CirclesLife/src/Test Data.xlsx");
		
		String email = excel.getData(0, 1, 3);
		String pass = excel.getData(0, 2, 3);
		
		pdriver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys(email);
		pdriver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		pdriver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}
