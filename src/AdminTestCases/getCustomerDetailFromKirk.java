package AdminTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Login;
import Admin.customerFile;
import automateBilling.uiActions;
import lib.ExcelData;

public class getCustomerDetailFromKirk {
	
	WebDriver driver;
	
	ExcelData data = new ExcelData();
	String url = data.getkirkurl();
	
	@BeforeTest
 	private WebDriver getBrowser() {
		
	System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
	driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
	//driver.manage().window().maximize();
	driver.get(url);
	
	return driver;
	}
	
	@Test
	public void CustomerDetail() {
		
		Login li = new Login(driver);
		li.kirkLogin();
		
		customerFile cf = new customerFile(driver);
		cf.cutomersDetails();
		
		
	}
	
	@AfterTest
		public void browserclose() {
			driver.close();
		}

}
