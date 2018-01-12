package ProdWebTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.logIn;
import lib.ExcelData;

public class PTC2_SignUp {
	
	WebDriver driver;
	//below lines of code is going to extract the information from excel file.
	//Please use(Initialize) those data only which you want to use and assign accordingly
	ExcelData data = new ExcelData();
	String url = data.getprodurl();
	
	@BeforeTest
 	private WebDriver getBrowser() {
		
	System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
	driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
	//driver.manage().window().maximize();
	driver.get(url);
	
	return driver;
     }
	
	@Test
	public void signup() {
		
		logIn signup = new logIn(driver);
		signup.signup();
		
	}
	
	@AfterTest
	public void browserclose() {
		driver.close();
	}

}
