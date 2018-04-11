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
		
		pdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;

		//Below lines of the code will Read the data from the excel. It also format the integer value to String.
		ExcelData data = new ExcelData();
		String email = data.getemail();
		String mobile = data.getmobile();
		String pincode = data.getpincode();
		String house = data.gethouse();
		String street = data.getstreet();
		String unit = data.getunit();
		String building = data.getbuilding();
		//String nric = data.getnric();
		
		WebElement iname = pdriver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement imobile = pdriver.findElement(By.xpath("//input[@name='contactNumber']"));
		WebElement iemail = pdriver.findElement(By.xpath("//div[@class='col-xs-12']/div/div/input[@name='email']"));
		
		//Below line of code is going to fill all the form details entered into excel.
		
		iname.clear();
		iname.sendKeys("Automation Order");
		
		WebElement E1 = pdriver.findElement(By.xpath("//select[@name='birthDay']"));
		WebElement E2 = pdriver.findElement(By.xpath("//select[@name='birthMonth']"));
		WebElement E3 = pdriver.findElement(By.xpath("//select[@name='birthYear']"));
		Select D = new Select(E1); Select O = new Select(E2); Select B = new Select(E3);
		D.selectByValue("15"); O.selectByValue("03"); B.selectByValue("1991");
		
		imobile.clear(); imobile.sendKeys(mobile);
		iemail.clear(); iemail.sendKeys(email);
		
		WebElement nationality = pdriver.findElement(By.xpath("//select[@name='topNationality']"));
		boolean exist = nationality.equals(nationality);
		
		if (exist = true) {
			
			Select N = new Select(nationality);
			N.selectByValue("IND");
			
		}

		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement NRIC = pdriver.findElement(By.xpath("//select[@name='docType']"));
		WebElement iNRIC = pdriver.findElement(By.xpath("//input[@name='nric']"));
		
		Select ID = new Select(NRIC);
		ID.selectByValue("NRIC");
		iNRIC.clear(); iNRIC.sendKeys("S8927668C");
		
		jse.executeScript("window.scrollBy(0,500)", "");
		
		pdriver.findElement(By.xpath("//div[@class= 'col-xs-6'][1]")).click();
		uploadFile uf = new uploadFile(pdriver);
		uf.Uploadfile();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//div[@class= 'col-xs-6'][2]")).click();
		//pdriver.findElement(By.cssSelector("//div[@class= 'col-xs-6'][2]")).click();
		uf.Uploadfile();
		
		jse.executeScript("window.scrollBy(0,500)", "");
		
		//Below line of code will enter the deliver address details.
				WebElement ipincode = pdriver.findElement(By.xpath("//*[@id=\"PlacesAutocomplete__root\"]/input"));
				ipincode.click(); ipincode.sendKeys(pincode);
				
				WebElement ihouse = pdriver.findElement(By.xpath("//input[@name='deliveryBlkHse']"));
				WebElement istreet = pdriver.findElement(By.xpath("//input[@name='deliveryStreetName']"));
				WebElement iunit = pdriver.findElement(By.xpath("//input[@name='deliveryUnit']"));
				WebElement ibuilding = pdriver.findElement(By.xpath("//input[@name='deliveryBuildingName']"));
				
				ihouse.clear(); ihouse.sendKeys(house);
				istreet.clear(); istreet.sendKeys(street);
				iunit.clear(); iunit.sendKeys(unit);
				ibuilding.clear(); ibuilding.sendKeys(building);
				
				jse.executeScript("window.scrollBy(0,250)", "");
				
				pdriver.findElement(By.xpath("//div[@class='col-xs-15 delivery-slots-day'][4]")).click();
				
				//Selecting the Delivery Slot timing
				jse.executeScript("window.scrollBy(0,300)", "");
				
				pdriver.findElement(By.xpath("//div[@class='col-sm-4 col-xs-6 delivery-slots-time'][1]")).click();
				

				

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//div[@class='btn btn-primary btn-lg btn-block Links']")).click();
		
		pdriver.findElement(By.xpath("//div[@class='btn btn-primary btn-lg btn-block Links']")).click();
		
	}

}