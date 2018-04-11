package CirclesCareApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CirclesAppDashboardPage {
	
	WebDriver driver;
	public CirclesAppDashboardPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOnMenuButton() {
		
		driver.findElement(By.className(appUIElement.menuButton)).click();
	}

}
