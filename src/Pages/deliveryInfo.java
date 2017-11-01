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
		
		ExcelConfig excel = new ExcelConfig("/Users/sumitkumar/eclipse-workspace/CirclesLife/src/Test Data.xlsx");
		//String email = excel.getData(0, 1, 0);
		//String pass = excel.getData(0, 1, 1);
		//String mobile = excel.getData(0, 1, 2);
		//String pincode = excel.getData(0, 1, 3);
		String house = excel.getData(0, 1, 4);
		String street = excel.getData(0, 1, 5);
		String unit = excel.getData(0, 1, 6);
		String building = excel.getData(0, 1, 7);
		String nric = excel.getData(0, 1, 8);
		
		pdriver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Automation Order");
		
		WebElement E1 = pdriver.findElement(By.xpath("//select[@name='birthDay']"));
		WebElement E2 = pdriver.findElement(By.xpath("//select[@name='birthMonth']"));
		WebElement E3 = pdriver.findElement(By.xpath("//select[@name='birthYear']"));
		Select D = new Select(E1); Select O = new Select(E2); Select B = new Select(E3);
		D.selectByValue("15"); O.selectByValue("03"); B.selectByValue("1991");
		
		pdriver.findElement(By.xpath("//input[@name='contactNumber']")).sendKeys("81267152");
		
		//Below line of code will enter the deliver address details.
		pdriver.findElement(By.xpath("//input[@name='deliveryPostalCode']")).sendKeys("600340");
		pdriver.findElement(By.xpath("//input[@name='deliveryBlkHse']")).sendKeys(house);
		pdriver.findElement(By.xpath("//input[@name='deliveryStreetName']")).sendKeys(street);
		pdriver.findElement(By.xpath("//input[@name='deliveryStreetName']")).sendKeys(unit);
		pdriver.findElement(By.xpath("//input[@name='deliveryBuildingName']")).sendKeys(building);
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement NRIC = pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[1]/div/div/select"));
		Select ID = new Select(NRIC);
		ID.selectByValue("NRIC");
		pdriver.findElement(By.xpath("//input[@name='nric']")).sendKeys(nric);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[3]/div[2]/div[1]/div")).click();

		uploadFile uf = new uploadFile(pdriver);
		uf.Uploadfile();
		
		/*
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//pdriver.navigate().refresh();
		*/
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.cssSelector("#st-container > div > div > div:nth-child(2) > span > div > div:nth-child(2) > div > div > div > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div")).click();
		uf.Uploadfile();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//div[@class='btn btn-primary btn-lg btn-block Links']")).click();
	}

}
