package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.ExcelData;
//import lib.WriteResult;


public class logIn {
	
	public WebDriver pdriver;
	public WebDriverWait wait;
	
	public logIn(WebDriver driver) {
		pdriver = driver; 
		wait = new WebDriverWait(pdriver, 60);
	}
	
		///Users/sumitkumar/eclipse-workspace/CirclesLife/src/lib/Test-Sheet.numbers
		//Below line of excel code is going to import the data from excel.
		ExcelData data = new ExcelData();
		String email = data.getemail();
		String pass = data.getpass();
		String sname = data.getsname();
		String slast = data.getslast();
		String semail = data.getsemail();
		String spass = data.getspass();
		
		public void login() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement login = pdriver.findElement(By.xpath("//a[@href='https://shop.circles.life/login']"));
		//login.click();
		//a[href='#']
		//button[@id='ingressfailed']
		//pdriver.findElement(By.xpath("//*[@id=\'site-navigation\']/div[1]/div[2]/div/a[2]")).click();
		pdriver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		pdriver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[3]/form/div[4]/div/div/button")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='pocket-button']")));
		
		System.out.println("User logged into website");
		
		/*
		int count = 0;
		
		WriteResult wr = new WriteResult("/Users/sumitkumar/git/CirclesLife/src/Test Data.xlsx");
		wr.getcount(count);
		wr.writeresult();
		
		
		/*
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[1]/div/div/div[2]/div/a[6]/div")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		}
		
		public void signup() {
			pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			pdriver.findElement(By.xpath("//div[@class='container-fluid']/div/a[2]/div")).click();
			pdriver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(sname);
			pdriver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(slast);
			pdriver.findElement(By.xpath("//div[@class='col-xs-12']/div/div/input[@name='email']")).sendKeys(semail);
			pdriver.findElement(By.xpath("//div[@class='col-xs-12']/div/div/input[@name='password']")).sendKeys(spass);
			pdriver.findElement(By.xpath("//div[@class='offset-xs-1 col-xs-10']/button[@type='submit']")).click();
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='hidden-md-down']/div/a[6]")));
			System.out.println("User has been successfully signup");
		}
		
		public void logout() {
			
			pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[1]/div/div/div[2]/div/a[6]/div")).click();
			
		}
}