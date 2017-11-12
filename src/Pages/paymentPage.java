package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import lib.ExcelData;

public class paymentPage {
	
	WebDriver pdriver;
	
	public paymentPage(WebDriver driver) {
		pdriver = driver;
	}
	
	public void PaymentPage() {
		
		ExcelData data = new ExcelData();
		String visa = data.getvisa();
		String cvv = data.getcvv();
		String name = data.getname();

		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//*[@id=\'logo\']")).click();
		pdriver.findElement(By.xpath("//*[@id=\'creditCardNum\']")).sendKeys(visa);
		
		WebElement month = pdriver.findElement(By.xpath("//select[@name='expMonth']")); Select ExpMon = new Select(month); ExpMon.selectByValue("06");
		WebElement year = pdriver.findElement(By.xpath("//select[@name='expYear']")); Select ExpYear = new Select(year); ExpYear.selectByValue("22");
		
		pdriver.findElement(By.xpath("//input[@id='creditCardCvv2']")).sendKeys(cvv);
		pdriver.findElement(By.xpath("//*[@id=\'creditCardName\']")).sendKeys(name);
		
		pdriver.findElement(By.xpath("//*[@id=\'submitBtn\']")).click();
		
	}

	
}
