package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.PhoneOnly;
import Pages.logIn;
import Pages.mobileDevice;
import Pages.normalUser;
import Pages.paymentPage;
import Pages.portInFlow;
import lib.ExcelData;

public class Regression_test {
	
	WebDriver driver;
	//below lines of code is going to extract the information from excel file.
	//Please use(Initialize) those data only which you want to use and assign accordingly
	ExcelData data = new ExcelData();
	String Auth = data.getauthurl();
	String url = data.getstagurl();
	String borgurl = data.getborgurl();
	
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
	
	@Test (priority = 1)
	public void normalflow() {
		//This function is going to create a normal mobile number form website.
		//Including login into website, Selecting a number, fill the delivery page and then do the payment.
		
		logIn login = new logIn(driver);
		login.login();
		
		normalUser nu = new normalUser(driver);
		nu.NormalUser();
		
		paymentPage pg = new paymentPage(driver);
		pg.PaymentPage();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		System.out.println("normalflow has been executed successfully.");
	}
	
	@Test (priority = 2)
	public void portinUser() {
		
		driver.get(url);
				
		portInFlow pf = new portInFlow(driver);
		pf.portin();
		
		paymentPage pg = new paymentPage(driver);
		pg.PaymentPage();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		System.out.println("portinUser has been executed successfully.");
	}
	
	@Test (priority = 3)
	public void simandphone() {
		
		driver.get(url);
		
		mobileDevice md = new mobileDevice(driver);
		md.before();
		md.fullpayment();
		//md.after();
		
		normalUser nu = new normalUser(driver);
		nu.NormalUser();
		
		paymentPage pg = new paymentPage(driver);
		pg.PaymentPage();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("simandphone has been executed successfully.");
	}
	
	@Test (priority = 4)
	public void Portsimandphone() {
		
		driver.get(url);
		
		mobileDevice md = new mobileDevice(driver);
		md.before();
		md.fullpayment();
		md.after();
		
		portInFlow pf = new portInFlow(driver);
		pf.portin();
		
		paymentPage pg = new paymentPage(driver);
		pg.PaymentPage();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("Portsimandphone has been executed successfully.");
	}
	
	
	@Test (priority = 5)
	public void phoneOnly() {
		
		driver.get(url);
		
		PhoneOnly po = new PhoneOnly(driver);
		po.phoneonly();
		
		paymentPage pg = new paymentPage(driver);
		pg.PaymentPage();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("phoneOnly has been executed successfully.");
	}
	
	

}
