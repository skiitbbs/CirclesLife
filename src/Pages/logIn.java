package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class logIn {
	
	public WebDriver pdriver;
	
	public logIn(WebDriver driver) {
		pdriver = driver;
	}
	
	///Users/sumitkumar/eclipse-workspace/CirclesLife/src/lib/Test-Sheet.numbers
	
		/*
	//Below line of excel code is going to import the data from excel.
		ExcelConfig excel = new ExcelConfig("/Users/sumitkumar/eclipse-workspace/CirclesLife/src/lib/Test-Sheet.numbers");
		String email = excel.getData(0, 0, 0);
		String pass = excel.getData(0, 0, 1);
		*/
		
		public void login() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//*[@id=\'site-navigation\']/div[1]/div[2]/div/a[2]")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/form/div[1]/div/div/div[2]/input")).sendKeys("sumit.kumar.iitbbsr@gmail.com");
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/form/div[2]/div/div/div[2]/input")).sendKeys("mummy ilu");
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/form/div[4]/div/div/button")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[1]/div/div/div[2]/div/a[6]/div")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
		public void logout() {
			
			pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[1]/div/div/div[2]/div/a[6]/div")).click();
			
		}
}
