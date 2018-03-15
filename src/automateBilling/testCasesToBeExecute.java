package automateBilling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import elitecoreElements.crestelLogIn;
import elitecoreElements.customersDetails;
import elitecoreElements.trialBillSearch;
import lib.ExcelData;

public class testCasesToBeExecute {
	
	WebDriver driver;
	
	//below lines of code is going to extract the information from excel file.
	//Please call(Initialize) those data only which you want to use and assign accordingly.
	ExcelData data = new ExcelData();
	String url = data.getProdElitecoreurl();

	@BeforeTest
 	private WebDriver getBrowser() {
		
	System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
	driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
	//driver.manage().window().maximize();
	driver.get(url);
	
	return driver;
     }
	
	//@Test
	public void CheckBill() {
		
		crestelLogIn login = new crestelLogIn(driver);
		login.loginToCrestel();
		
		trialBillSearch tbs = new trialBillSearch(driver);
		tbs.trialBillrun();
		
	}
	
	@Test
	public void getCustomerDetails() {
		
		crestelLogIn login = new crestelLogIn(driver);
		login.loginToCrestel();
		
		customersDetails cd = new customersDetails(driver);
		cd.getCustomerInformation();
		cd.writeinexcel();
		
		
		
	}
	
	//@AfterTest
	public void browserclose() {
		driver.close();
	}

}
