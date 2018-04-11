package CirclesCareApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CirclesAppMenuPage {
	
	WebDriver driver;
	
	public CirclesAppMenuPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clickOnCustomize() {
		
		driver.findElement(By.xpath(appUIElement.cuzB)).click();
		
	}
	
	public void clickOnProfileButton() {
		driver.findElement(By.id(appUIElement.profileButton)).click();
		
	}

}
