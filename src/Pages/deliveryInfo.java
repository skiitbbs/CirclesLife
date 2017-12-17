package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import lib.ExcelData;
import lib.uploadFile;

public class deliveryInfo {
	
public WebDriver pdriver;
	
	public deliveryInfo(WebDriver driver) {
		pdriver = driver;
	}
	
	public void DeliveyInfo() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Below lines of the code will Read the data from the excel. It also format the integer value to String.
		ExcelData data = new ExcelData();
		String mobile = data.getmobile();
		String pincode = data.getpincode();
		String house = data.gethouse();
		String street = data.getstreet();
		String unit = data.getunit();
		String building = data.getbuilding();
		String nric = data.getnric();
		
		//Below line of code is going to fill all the form details entered into excel.
		
		pdriver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Automation Order");
		
		WebElement E1 = pdriver.findElement(By.xpath("//select[@name='birthDay']"));
		WebElement E2 = pdriver.findElement(By.xpath("//select[@name='birthMonth']"));
		WebElement E3 = pdriver.findElement(By.xpath("//select[@name='birthYear']"));
		Select D = new Select(E1); Select O = new Select(E2); Select B = new Select(E3);
		D.selectByValue("15"); O.selectByValue("03"); B.selectByValue("1991");
		
		pdriver.findElement(By.xpath("//input[@name='contactNumber']")).sendKeys(mobile);
		
		//Below line of code will enter the deliver address details.
		pdriver.findElement(By.xpath("//input[@name='deliveryPostalCode']")).sendKeys(pincode);
		pdriver.findElement(By.xpath("//input[@name='deliveryBlkHse']")).sendKeys(house);
		pdriver.findElement(By.xpath("//input[@name='deliveryStreetName']")).sendKeys(street);
		pdriver.findElement(By.xpath("//input[@name='deliveryUnit']")).sendKeys(unit);
		pdriver.findElement(By.xpath("//input[@name='deliveryBuildingName']")).sendKeys(building);
		
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		pdriver.findElement(By.xpath("//div[@class='col-xs-15 delivery-slots-day'][4]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		jse.executeScript("window.scrollBy(0,300)", "");
		
		pdriver.findElement(By.xpath("//span[text()='9:00 - 1:00 PM']")).click();
		
		
		WebElement NRIC = pdriver.findElement(By.xpath("//select[@name='docType']"));
		Select ID = new Select(NRIC);
		ID.selectByValue("NRIC");
		pdriver.findElement(By.xpath("//input[@name='nric']")).sendKeys("S8927668C");
		
		/*
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		jse.executeScript("window.scrollBy(0,400)", "");
		
		pdriver.findElement(By.xpath("//div[@class= 'col-xs-6'][1]")).click();

		uploadFile uf = new uploadFile(pdriver);
		uf.Uploadfile();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div/div[2]/div/div/div/div[4]/div[2]/div[3]/div[2]/div[2]/div")).click();
		//pdriver.findElement(By.cssSelector("//div[@class= 'col-xs-6'][2]")).click();
		uf.Uploadfile();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
