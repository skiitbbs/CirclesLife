package CirclesCareApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CirclesAppProfilePage {
	
	WebDriver driver;
	
	public CirclesAppProfilePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOnEditProfile() {
		
		driver.findElement(By.xpath(appUIElement.ep)).click();
	}
	
	public void enterValidDetails() {
		
		driver.findElement(By.id(appUIElement.enterNickName)).sendKeys("Sumit Test");
		
	}
	
	public void clickOnDone() {
		
		driver.findElement(By.xpath(appUIElement.doneButton)).click();
	}
	
	public void portInOperation() throws InterruptedException {
		
		driver.findElement(By.xpath(appUIElement.portInButton)).click();
		driver.findElement(By.id(appUIElement.portingNumber)).sendKeys("88346721");
		driver.findElement(By.id(appUIElement.postPaid)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(appUIElement.chooseOne)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(appUIElement.provider)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(appUIElement.chooseDate)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(appUIElement.portingDate)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(appUIElement.nircID)).click();
	}
	
	public void updateBillingAddress() throws InterruptedException {
		
		driver.findElement(By.xpath(appUIElement.editBillingAddress)).click();
		
	}

}
