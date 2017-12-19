package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.logIn;
import Pages.normalUser;
import Pages.paymentPage;

public class TC3_SimOrder {
	
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
	public void normalflow() {
		
		logIn login = new logIn(driver);
		login.login();
		
		normalUser nu = new normalUser(driver);
		nu.NormalUser();
		
		paymentPage pg = new paymentPage(driver);
		pg.PaymentPage();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		login.logout();
	}

}
