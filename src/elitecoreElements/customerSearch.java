package elitecoreElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class customerSearch {
	
	public WebDriver pdriver;
	
	public customerSearch(WebDriver driver) {
		pdriver = driver;
	}
	
	public void gotoCustomerPage() {
		
		pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		WebElement leftmenu = pdriver.findElement(By.xpath(crestelui.account));
		//Thread will wait till it finds the given elements.
		//This statements are here to do the mouse hovering on left menu.
		Actions hover = new Actions(pdriver);
		hover.moveToElement(leftmenu).moveToElement(pdriver.findElement(By.xpath(crestelui.searchaccount))).build().perform();
		hover.moveToElement(pdriver.findElement(By.xpath(crestelui.searchaccount))).click().build().perform();
		System.out.println("Left Menu is clicked.");
		
		pdriver.switchTo().frame("zk_comp_55");

		pdriver.findElement(By.xpath("//input[@id='txtmobilenumber']")).sendKeys("87423620");
		//Going to Customer detail page. 
		pdriver.findElement(By.xpath(crestelui.searchbutton)).click();
		pdriver.findElement(By.xpath(crestelui.clickonname)).click();
		
	}

}
