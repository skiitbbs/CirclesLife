package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.logIn;
import Pages.signUp;

public class TestCase1 {
	
WebDriver driver;
	
	@BeforeTest
 	private WebDriver getBrowser() 
 	{
	
	System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
	driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
	driver.manage().window().maximize();
	driver.get("https://www.circles.life/");
	return driver;
     }
	
	@Test
	public void testcase1() {
		
		logIn login = new logIn(driver);
		login.login();
		
		//login.logout();
	}
	
	
	@Test
	public void testcase2() {
		
		driver.get("https://www.circles.life/");
		signUp signup = new signUp(driver);
		signup.signup();
	}
	

}
