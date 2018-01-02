package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage {
	
	WebDriver pdriver;
	
	public MyAccountPage(WebDriver driver) {
		pdriver = driver;
	}
	
	public void simlostflow() {
		
		pdriver.findElement(By.xpath("//div[@class='hidden-md-down']/div/a[3]")).click();
		WebElement select= pdriver.findElement(By.xpath("//*[@id=\"st-container\"]/div/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[1]/div/div/select"));
		Select phone = new Select(select);
		phone.selectByValue("7912");
		pdriver.findElement(By.xpath("")).sendKeys("S7131195C");
		pdriver.findElement(By.xpath("")).click();
	}

}
