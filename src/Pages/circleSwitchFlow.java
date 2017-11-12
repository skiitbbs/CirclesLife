package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import lib.ExcelData;

public class circleSwitchFlow {
	
public WebDriver pdriver;
	
	public circleSwitchFlow(WebDriver driver) {
		pdriver = driver;
	}
	
	public void CircleSwitchFlow() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ExcelData data = new ExcelData();
		String email = data.getemail();
		String pass = data.getpass();
		String portNo = data.getportin();
		
		//This below line of code will, Login and land on Switch option.
		pdriver.get("https://staging.circles.asia/switch/login");
		
		pdriver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		pdriver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[3]/form/div[4]/div/div/button")).click();
		
		//Below line of code will select the Switch option and proceed further accordingly.
		WebElement text = pdriver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(text);
		dropdown.selectByVisibleText("Before 31 Dec 2017");
		pdriver.findElement(By.xpath("//*[@id=\"st-container\"]/div/div/div[2]/span/div/div/footer/div/div/div/div")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div/footer/div/div/div/a")).click();
		
		pdriver.findElement(By.xpath("//input[@type='text']")).sendKeys(portNo);
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/div[2]/div/div/div/div/div/div[4]/div/div/div[1]/div/div[1]/div")).click();
		
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/div[2]/div/div/div/div/div/div[2]/button/span")).click();
		pdriver.findElement(By.xpath("//input[@id='input-otp']")).sendKeys("1234");
		
		//Below line of Code will enter the details on Delivery Info.
		deliveryInfo delivery = new deliveryInfo(pdriver);
		delivery.DeliveyInfo();
		
		
	}

}
