package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.PhoneOnly;
import Pages.logIn;
import Pages.paymentPage;

public class TC8_PhoneOnly {
	
	WebDriver driver;
	String Auth = "https://circles-admin:123qweAadmin@staging.circles.asia/login";
	String url = "https://staging.circles.asia/login";
	//String url = "https://shop.circles.life/login"
	
	@BeforeTest
 	private WebDriver getBrowser() 
 	{
		
	System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
	driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
	//driver.manage().window().maximize();
	driver.get(Auth);
	driver.get(url);
	
	return driver;
     }
	
	@Test
	public void phoneOnly() {
		
		logIn login = new logIn(driver);
		login.login();
		
		PhoneOnly po = new PhoneOnly(driver);
		po.phoneonly();
		
		paymentPage pg = new paymentPage(driver);
		pg.PaymentPage();
		
	}

}
