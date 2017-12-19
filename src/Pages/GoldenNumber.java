package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoldenNumber {
	
	public WebDriver pdriver;
	public WebDriverWait wait;
	
	public GoldenNumber(WebDriver driver) {
		pdriver = driver;
		wait = new WebDriverWait(pdriver, 30); 
	}
	
	public void goldenNumber() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//div[contains(text(), 'Keep old number')]")).click();
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/div[2]/div/div[1]/div/div/div[1]/div[2]/div/div")).click();
		pdriver.findElement(By.xpath("//*[@id='number-select-container']/div[2]/div/div/div/div/div[2]/div[3]/div/div[2]/div[3]/div[1]/button")).click();
		
		pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
		
	}

}
