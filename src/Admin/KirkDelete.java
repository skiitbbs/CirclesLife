package Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class KirkDelete {

	public WebDriver pdriver;
	
	public KirkDelete(WebDriver driver) {
		pdriver = driver;
	}
	
	public void kirkdelete() {
		
		pdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[1]")).sendKeys("sumit@circles.asia");
		//pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[2]")).sendKeys("Sumit@circles@12");
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/input[2]")).sendKeys("Sumit@123");
		pdriver.findElement(By.xpath("//*[@id=\"login-form\"]/div/button")).click(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\"nav-accordion\"]/li[1]/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.xpath("//*[@id=\"nav-accordion\"]/li[1]/ul/li[2]/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor)pdriver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		pdriver.findElement(By.xpath("//button[@id='ingressfailed']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pdriver.findElement(By.cssSelector("//tr[@class='odd']/td[8]/a[i[@class='fa fa-trash-o']]")).click();
	}
	
	
}
