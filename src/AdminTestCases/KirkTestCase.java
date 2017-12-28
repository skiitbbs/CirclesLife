package AdminTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.KirkDelete;

public class KirkTestCase {
	
	WebDriver driver;
	
	@BeforeTest
 	private WebDriver getBrowser() 
 	{
	
	//	System.setProperty("webdriver.gecko.driver", "//Users//sumitkumar//Downloads//Automation//geckodriver");
	//	driver = new FirefoxDriver();	
	//driver.manage().window().maximize();
		
		System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
		driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
		driver.get("https://riker.circles.asia:7443");
		//driver.get("https://circles-admin:123qweAadmin@staging.circles.asia/login");
		//driver.get("https://www.circles.life/");
	return driver;
     }
	
	@Test
	public void testkirkdelete() {
		
		KirkDelete kd = new KirkDelete(driver);
		kd.kirkdelete();
	}

}
