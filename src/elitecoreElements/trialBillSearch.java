package elitecoreElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class trialBillSearch {
	
	public WebDriver pdriver;
	
		public trialBillSearch(WebDriver driver) {
		pdriver = driver;
		}
	
		public void trialBillrun() {
			pdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement leftmenu = pdriver.findElement(By.xpath(crestelui.billing));
			//Thread will wait till it finds the given elements.
	
	
			//This statements are here to do the mouse hovering on left menu.
			Actions hover = new Actions(pdriver);
			hover.moveToElement(leftmenu).moveToElement(pdriver.findElement(By.xpath(crestelui.searchtrialbill))).build().perform();
			hover.moveToElement(pdriver.findElement(By.xpath(crestelui.searchtrialbill))).click().build().perform();
			System.out.println("Left Menu is clicked.");

			pdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
			pdriver.switchTo().frame("zk_comp_55");
	
			pdriver.findElement(By.xpath(crestelui.billingaccountnumber)).sendKeys("LW540318");
			pdriver.findElement(By.xpath(crestelui.billcycledropdown)).click();
			pdriver.findElement(By.xpath(crestelui.billcycledefault)).click();
			pdriver.findElement(By.xpath(crestelui.billdate)).click();
	
			pdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
			pdriver.findElement(By.xpath(crestelui.selectdate)).click();
			pdriver.findElement(By.xpath(crestelui.searchbill)).click();
	
			String winHandleBefore = pdriver.getWindowHandle();
	
			pdriver.findElement(By.xpath(crestelui.clickonbill)).click();
	
			for(String winHandle : pdriver.getWindowHandles()){
				pdriver.switchTo().window(winHandle);
			}
	
			pdriver.findElement(By.xpath(crestelui.formatdropdown)).click();
			pdriver.findElement(By.xpath(crestelui.selectpdf)).click();
			pdriver.findElement(By.xpath(crestelui.clickdownload)).click();
			pdriver.close();
	
			pdriver.switchTo().window(winHandleBefore);
	
		}

}
