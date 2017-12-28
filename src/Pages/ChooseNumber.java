package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseNumber {
	
	public WebDriver pdriver;
	
	public ChooseNumber(WebDriver driver) {
		pdriver = driver;
	}
	
	public void chooseNumber() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//div[@class='pocket-button']")).click();
		pdriver.findElement(By.xpath("//center[contains(text(), 'GET NEW NUMBER')]")).click();
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/div[2]/div/div/div/div/div[2]/div[4]/div/div[3]/div")).click();
		pdriver.findElement(By.xpath("//*[@id=\'number-select-container\']/div[2]/div/div/div/div/div[2]/div[4]/div/div[2]/div[3]/div[29]/button")).click();
		
		pdriver.findElement(By.xpath("//div[@class='offset-xs-2 col-xs-8']")).click();
		
		mobileDevice md = new mobileDevice(pdriver);
		md.after();
		
	}

}
