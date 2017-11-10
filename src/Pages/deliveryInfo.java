package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import lib.ExcelConfig;
import lib.uploadFile;

public class deliveryInfo {
	
public WebDriver pdriver;
	
	public deliveryInfo(WebDriver driver) {
		pdriver = driver;
	}
	
	public void DeliveyInfo() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Below lines of the code will Read the data from the excel. It also format the integer value to String.
		
		ExcelConfig excel = new ExcelConfig("/Users/sumitkumar/eclipse-workspace/CirclesLife/src/Test Data.xlsx");
		//String email = excel.getData(0, 1, 0);
		//String pass = excel.getData(0, 1, 1);
		String mobile = excel.getData(0, 3, 1);
		String pincode = excel.getData(0, 4, 1);
		String house = excel.getData(0, 5, 1);
		String street = excel.getData(0, 6, 1);
		String unit = excel.getData(0, 7, 1);
		String building = excel.getData(0, 8, 1);
		String nric = excel.getData(0, 9, 1);
		
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
		
		pdriver.findElement(By.xpath("//div[@class='col-xs-15 delivery-slots-day'][2]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//span[text()='9:00 - 1:00 PM']")).click();
		
		
		WebElement NRIC = pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[1]/div/div/select"));
		Select ID = new Select(NRIC);
		ID.selectByValue("NRIC");
		pdriver.findElement(By.xpath("//input[@name='nric']")).sendKeys(nric);
		
		/*
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[3]/div[2]/div[1]/div")).click();

		uploadFile uf = new uploadFile(pdriver);
		uf.Uploadfile();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.cssSelector("#st-container > div > div > div:nth-child(2) > span > div > div:nth-child(2) > div > div > div > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div")).click();
		uf.Uploadfile();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(pdriver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[4]/div[1]/div[1]/div/img")).isDisplayed()) {
			pdriver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[4]/div[1]/div[1]/div/img")).click();
		}
		
		pdriver.findElement(By.xpath("//div[@class='btn btn-primary btn-lg btn-block Links']")).click();
	}

}
