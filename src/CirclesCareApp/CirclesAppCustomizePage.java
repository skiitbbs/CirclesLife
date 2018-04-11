package CirclesCareApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CirclesAppCustomizePage {
	
	WebDriver driver;
	
	public CirclesAppCustomizePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clickOnPlus() {
		
		driver.findElement(By.xpath(appUIElement.pb)).click();
	}

	public void clickOnAddOn() {
		
		driver.findElement(By.xpath(appUIElement.addOn20GB)).click();
	}
	
	public void clickOnEnable() {
		
		driver.findElement(By.id(appUIElement.enableButton)).click();
		driver.findElement(By.xpath(appUIElement.buyNowButton)).click();
	}

}
