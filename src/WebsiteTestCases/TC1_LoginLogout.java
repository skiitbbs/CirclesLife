package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.OrderRefNumber;
import Pages.logIn;

public class TC1_LoginLogout {
	
	WebDriver driver;
	String Auth = "https://circles-admin:123qweAadmin@staging.circles.asia/login";
	String url = "https://staging.circles.asia/login";
	//String url = "https://shop.circles.life/login"
	
	@BeforeTest
 	private WebDriver getBrowser() {
		
	System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
	driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
	//driver.manage().window().maximize();
	driver.get(Auth);
	driver.get(url);
	
	return driver;
     }
	
	@Test
	public void login() {
		
		logIn login = new logIn(driver);
		login.login();
		
		OrderRefNumber orn = new OrderRefNumber(driver);
		orn.orderRefnumber();
		orn.writeOrder();
		
	}
	
	//@Test
	public void logout() {
		
		driver.get("https://staging.circles.asia/login");
		
		logIn login = new logIn(driver);
		login.logout();
	}
	
	@AfterTest
	public void browserclose() {
		driver.close();
	}

}
