package AdminTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.KirkDelete;
import lib.ExcelData;

public class KirkTestCase {
	
	WebDriver driver;
	ExcelData data = new ExcelData();
	String rikerurl = data.getrikerurl();
	KirkDelete kd;
	
	@BeforeTest
 	private WebDriver getBrowser() 
 	{
	
	//	System.setProperty("webdriver.gecko.driver", "//Users//sumitkumar//Downloads//Automation//geckodriver");
	//	driver = new FirefoxDriver();	
	//driver.manage().window().maximize();
		
		System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
		driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
		driver.get(rikerurl);
		//driver.get("https://circles-admin:123qweAadmin@staging.circles.asia/login");
		//driver.get("https://www.circles.life/");
		
		kd = new KirkDelete(driver);
		kd.kirkdelete();
		return driver;
     }
	
	@Test (invocationCount = 4)
	public void testkirkdelete() {
		kd.delete();
	}

}
