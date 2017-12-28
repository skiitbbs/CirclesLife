package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomisePlan {
	
	public WebDriver pdriver;
	
	public CustomisePlan(WebDriver driver) {
		pdriver = driver;
	}
	
	public void customisePlan() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath("//div[contains(text(), 'Add more Data, Talktime or SMS')]")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div[3]/span")).click();
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div[3]/span")).click();
		
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[3]/div[2]/div/div[3]/span")).click();
		
		pdriver.findElement(By.xpath("//*[@id=\'st-container\']/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[4]/div[2]/div/div[3]/span")).click();
		
		pdriver.findElement(By.xpath("//a[@action='PUSH']")).click();
		
		mobileDevice md = new mobileDevice(pdriver);
		md.after();
		
	}

}
