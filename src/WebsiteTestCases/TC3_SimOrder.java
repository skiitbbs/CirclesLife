package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.DocApproval;
import Admin.Login;
import Admin.OrderDelivery;
import Admin.OrderRefNumber;
import Admin.PlanSwitch;
import Pages.logIn;
import Pages.normalUser;
import Pages.paymentPage;
import lib.ExcelData;

public class TC3_SimOrder {
	
	WebDriver driver;
	//below lines of code is going to extract the information from excel file.
	//Please use(Initialize) those data only which you want to use and assign accordingly
	ExcelData data = new ExcelData();
	String Auth = data.getauthurl();
	String url = data.getstagurl();
	String borgurl = data.getborgurl();
	/*
	String url = data.getprodurl();
	String vulcurl = data.getvulcanurl();
	String rikerurl = data.getrikerurl();
	String kirkurl = data.getkirkurl();
	*/
	
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
		
		//This fuction is going to fetch the Order Ref Number and write it in to excel.
		
		OrderRefNumber orn = new OrderRefNumber(driver);
		orn.orderRefnumber();
		orn.writeOrder();
		
		//Below line of code if going to do the backend part.
		//Which includes login into Admin, Approve the order, Mark it as a delivered then do the Plan Switch.
		
		driver.get(borgurl);
		
		Login li = new Login(driver);
		li.login();
		
		DocApproval da = new DocApproval(driver);
		da.docapprove();
		
		OrderDelivery del = new OrderDelivery(driver);
		del.orderdelivery();
		
		PlanSwitch ps = new PlanSwitch(driver);
		ps.planswitch();
		//login.logout();
		//by end of this code, new normal mobile number has been generated.
	}
	
	@AfterTest
	public void browserclose() {
		driver.close();
	}

}
