package CirclesCareAppTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class CirclesLifeAppTC01 {
	
	WebDriver driver;

	@BeforeTest
    public void setUp() throws MalformedURLException {
		
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
	
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("Full-Reset", "false");
		capabilities.setCapability("deviceName", "8431434c414b5441");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.circles.selfcare.qa");
		capabilities.setCapability("appActivity", "com.circles.selfcare.ui.activity.LaunchActivity");
	
		
		driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		
	}
	
	@Test
	public void checkDataBalance() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//String otp = null;
		String ActualData = new String();
		ActualData = "2.7 GB to go";
		
		driver.findElement(By.id("com.circles.selfcare.qa:id/activity_intro_start_button")).click();
		driver.findElement(By.id("com.circles.selfcare.qa:id/fragment_intro_registration_number_edit")).sendKeys("87482333");
		driver.findElement(By.id("com.circles.selfcare.qa:id/fragment_intro_registration_next_button")).click();
		
//		getOTP.main(otp);
//		
//		String otp1 = otp;
//		
//		driver.findElement(By.id("com.circles.selfcare.qa:id/fragment_intro_registration_auth_number_edit")).sendKeys(otp1);
//		
		WebElement dataUsage = driver.findElement(By.id("com.circles.selfcare.qa:id/pre_text_view"));
		String DataBalance = dataUsage.getText();
		
		Assert.assertEquals(DataBalance, ActualData);
	}
}
