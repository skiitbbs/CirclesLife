package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.ExcelData;
//import lib.WriteResult;
import lib.uielements;


public class logIn {
	
	public WebDriver pdriver;
	public WebDriverWait wait;
	
	public logIn(WebDriver driver) {
		pdriver = driver; 
		wait = new WebDriverWait(pdriver, 60);
	}
	
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
		
		pdriver.findElement(By.xpath(uielements.email)).sendKeys(email);
		pdriver.findElement(By.xpath(uielements.pass)).sendKeys(pass);
		pdriver.findElement(By.xpath(uielements.loginsubmit)).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(uielements.planselectnumber)));
		
		}
		
		public void signup() {
			pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			pdriver.findElement(By.xpath(uielements.signupbutton)).click();
			pdriver.findElement(By.xpath(uielements.signupfirstname)).sendKeys(sname);
			pdriver.findElement(By.xpath(uielements.signuplastname)).sendKeys(slast);
			pdriver.findElement(By.xpath(uielements.signupemailadd)).sendKeys(semail);
			pdriver.findElement(By.xpath(uielements.signuppassword)).sendKeys(spass);
			pdriver.findElement(By.xpath(uielements.signupsubmit)).click();
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(uielements.planselectnumber)));
			System.out.println("User has been successfully signup");
		}
		
		public void logout() {
			
			pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			pdriver.findElement(By.xpath(uielements.logout)).click();
			
		}
}