package automateBilling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import kirkElements.kirkCustomerDetails;
import kirkElements.kirklogin;
import lib.ExcelData;

	public class kirkTestCasetoBeExecute {
	
		WebDriver driver;
	
		//below lines of code is going to extract the information from excel file.
		//Please call(Initialize) those data only which you want to use and assign accordingly.
		ExcelData data = new ExcelData();
		String url = data.getkirkurl();

		@BeforeTest
		private WebDriver getBrowser() {
		
			System.setProperty("webdriver.chrome.driver","//Users//sumitkumar//Downloads//Automation//chromedriver");
			driver= new ChromeDriver(); // Create a new instance for the Chrome Driver.
			//driver.manage().window().maximize();
			driver.get(url);
	
			return driver;
     }
		
		@Test
		public void logintokirk() {
			
			kirklogin kl = new kirklogin(driver);
			kl.logintokirk();
			
			kirkCustomerDetails kcd = new kirkCustomerDetails(driver);
			kcd.gotoCustomertab();
			kcd.getkirkcustomerdetails();
			kcd.cutomersAddOnDetails();
		}
		
		@AfterTest
		public void closebrowser() {
			driver.close();
		}

}
