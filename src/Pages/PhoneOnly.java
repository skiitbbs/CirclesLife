package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhoneOnly {
	
	public WebDriver pdriver;
	
	public PhoneOnly(WebDriver driver) {
		pdriver = driver;
		
	}
	
	public void phoneonly() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		
		pdriver.findElement(By.xpath("//a[contains(text(), 'Buy phone here')]")).click();
		
		mobileDevice md = new mobileDevice(pdriver);
		md.fullpayment();
		md.after();
		
		deliveryInfo di = new deliveryInfo(pdriver);
		di.DeliveyInfo();
		
	}

}
