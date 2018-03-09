package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.uielements;

public class CustomisePlan {
	
	public WebDriver pdriver;public WebDriverWait wait;
	
	public CustomisePlan(WebDriver driver) {
		pdriver = driver;
		wait = new WebDriverWait(pdriver, 60);
	}
	
	public void customisePlan() {
		
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath(uielements.customplan)).click();
		pdriver.findElement(By.xpath(uielements.customincreasedata)).click();
		pdriver.findElement(By.xpath(uielements.customincreasedata)).click();
		pdriver.findElement(By.xpath(uielements.customeincreasetalktime)).click();		
		pdriver.findElement(By.xpath(uielements.customeincreasesms)).click();
		
		//Above lines will add Data, Talk-time and SMS in to Base Plan and then save it.
		
		pdriver.findElement(By.xpath(uielements.customsavebutton)).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(uielements.planselectnumber)));
		
		System.out.println("Plan has been successfully saved.");
		
		pdriver.findElement(By.xpath(uielements.proceedbutton)).click();
		
	}

}
