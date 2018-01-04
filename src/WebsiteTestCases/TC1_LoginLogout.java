package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.OrderRefNumber;
import Pages.logIn;
import lib.ExcelData;

public class TC1_LoginLogout {
	
	WebDriver driver;
	//below lines of code is going to extract the information from excel file.
	//Please use(Initialize) those data only which you want to use and assign accordingly
	ExcelData data = new ExcelData();
	String Auth = data.getauthurl();
	String url = data.getstagurl();
	
	/*
	String url = data.getprodurl();
	String borgurl = data.getborgurl();
	String vulcurl = data.getvulcanurl();
	String rikerurl = data.getrikerurl();
	String kirkurl = data.getkirkurl();
	*/

	
	@BeforeTest
 	private WebDriver getBrowser() {
		
	System.setProperty("webdriver.chrome.driver","//Users//ahalya//AUTOMATION//chromedriver");
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
		
		/*
		OrderRefNumber orn = new OrderRefNumber(driver);
		orn.orderRefnumber();
		orn.writeOrder();
		*/
	}
	
	//@Test
	public void logout() {
		
		logIn login = new logIn(driver);
		login.logout();
	}
	
	@AfterTest
	public void browserclose() {
		driver.close();
	}

}
