package automateBilling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elitecoreElements.crestelui;
import lib.ExcelData;

public class uiActions {
	
	public WebDriver pdriver;
	public WebDriverWait wait;
	
	ExcelData data = new ExcelData();
	String email = data.getadminemail();
	String pass = data.getelitepass();
	
	public uiActions(WebDriver driver) {
		pdriver = driver;
	}
	
	public void loginToCrestel() {
		pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//input[@id='txtusername']")).sendKeys(email);
		pdriver.findElement(By.xpath("//input[@id='txtpassword']")).sendKeys(pass);
		pdriver.findElement(By.xpath("//span[@id='zk_comp_37']")).click();
		int size = pdriver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Number of fram in this page is: " +size);
	
	}
	
	public void gotoCustomerPage() {
		pdriver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		WebElement leftmenu = pdriver.findElement(By.xpath(crestelui.account));
		
		//WebElement leftmenu = pdriver.findElement(By.xpath("//*[@id='account-a']/span"));
		//Thread will wait till it finds the given elements.
		//This statements are here to do the mouse hovering on Star.
		Actions hover = new Actions(pdriver);
		hover.moveToElement(leftmenu).moveToElement(pdriver.findElement(By.xpath(crestelui.searchaccount))).build().perform();
		hover.moveToElement(pdriver.findElement(By.xpath(crestelui.searchaccount))).click().build().perform();
		System.out.println("Left Menu is clicked.");
		
		pdriver.switchTo().frame("zk_comp_55");

		//pdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		pdriver.findElement(By.xpath("//input[@id='txtmobilenumber']")).sendKeys("81267152");
		//pdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Going to Customer detail page. 
		//pdriver.findElement(By.xpath("//*[@id=\'searchbox\']")).sendKeys("Search Trial Bill");
		
		pdriver.findElement(By.xpath(crestelui.searchbutton)).click();
		
		pdriver.findElement(By.xpath("//*[@id='name1']")).click();
		
		/*
		pdriver.findElement(By.xpath("//*[@id=\'searchicon\']/i")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//td[@id=\'txtbillnumber-chdextr\']")).click();
		pdriver.findElement(By.xpath("//td[@id=\'txtbillnumber-chdextr\']")).sendKeys("REG0000005574456");
		pdriver.findElement(By.xpath("//*[@id=\'btnsearch\']")).click();
		
		pdriver.findElement(By.xpath("//*[@id=\'name1\']")).click();
		pdriver.findElement(By.xpath("//*[@id=\'bankname0\']")).click();
		pdriver.findElement(By.xpath("//*[@id=\'financialinformation-exp\']")).click();
		pdriver.findElement(By.xpath("//*[@id=\'financialdetails\']")).click();
		
		pdriver.findElement(By.xpath("//*[@id=\'zk_comp_243\']")).click();
		*/
		
	}
	
	public void CrestelCustomers() {
		
		pdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement leftmenu = pdriver.findElement(By.xpath("//*[@id='billing-a']/span"));
		//Thread will wait till it finds the given elements.
		//This statements are here to do the mouse hovering on Star.
		Actions hover = new Actions(pdriver);
		hover.moveToElement(leftmenu).moveToElement(pdriver.findElement(By.xpath("//*[@id='searchtrialbill-a']"))).build().perform();
		hover.moveToElement(pdriver.findElement(By.xpath("//*[@id='searchtrialbill-a']"))).click().build().perform();
		System.out.println("Search Trial Bill is clicked.");

		pdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//pdriver.switchTo().frame("zk_comp_55");
		pdriver.switchTo().frame("zk_comp_55");

		
		pdriver.findElement(By.xpath("//*[@id='txtaccountnumber']")).sendKeys("LW540318");
		/*
		WebElement billCycle = pdriver.findElement(By.xpath("//i[@class='z-combobox-icon z-icon-caret-down']"));
		Select date = New Select(billCycle);
		*/
		
		pdriver.findElement(By.xpath("//i[@class='z-combobox-icon z-icon-caret-down']")).click();
		pdriver.findElement(By.xpath("//li[@id='zk_comp_95']")).click();
		pdriver.findElement(By.xpath("//*[@id='dtbappliedfromdate-btn']/i")).click();
		
		pdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//*[@id='_z_0-w0']/td[4]")).click();
		
		pdriver.findElement(By.xpath("//*[@id=\'btnsearch\']")).click();
		
		String winHandleBefore = pdriver.getWindowHandle();
		
		pdriver.findElement(By.xpath("//*[@id='zk_comp_124']")).click();
		
		for(String winHandle : pdriver.getWindowHandles()){
		    pdriver.switchTo().window(winHandle);
		}
		
		pdriver.findElement(By.xpath("//a[@id='selectformattypecombo-btn']")).click();
		
		pdriver.findElement(By.xpath("//*[@id='zk_comp_45']/span[2]")).click();
		
		pdriver.findElement(By.xpath("//*[@id='btndownloadbill']")).click();
		
		pdriver.close();
		
		pdriver.switchTo().window(winHandleBefore);
		
	}

}
