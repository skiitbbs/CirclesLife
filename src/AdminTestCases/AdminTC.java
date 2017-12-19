package AdminTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.DocApproval;
import Admin.Login;
import Admin.OrderDelivery;
import Admin.PlanSwitch;

public class AdminTC {
	
	WebDriver driver;
	
	@BeforeTest
 	private WebDriver getBrowser() 
 	{
		
	System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
	driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
	//driver.manage().window().maximize();
	driver.get("borg.circles.asia:6180");
	//driver.get("https://circles-admin:123qweAadmin@staging.circles.asia/login");
	//driver.get("https://www.circles.life/");
	
	return driver;
     }
	
	@Test
	public void admin() {
		
		Login li = new Login(driver);
		li.login();
		
		DocApproval da = new DocApproval(driver);
		da.docapprove();
		
		OrderDelivery del = new OrderDelivery(driver);
		del.orderdelivery();
		
		PlanSwitch ps = new PlanSwitch(driver);
		ps.planswitch();
		
	}
	
	@AfterTest
	public void browserclose() {
		driver.close();
	}

}
