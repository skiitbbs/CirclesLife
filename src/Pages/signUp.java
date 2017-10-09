package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUp {

	public WebDriver pdriver;
	
	public signUp(WebDriver driver) {
		pdriver = driver;
	}
	
	public void signup() {
		
		pdriver.findElement(By.xpath("//*[@id=\'site-navigation\']/div[1]/div[2]/div/a[1]")).click();
		pdriver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("sumit");
		pdriver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kumar");
		pdriver.findElement(By.xpath("//input[@name='email']")).sendKeys("sumit01@mailinator.com");
		pdriver.findElement(By.xpath("//input[@name='password']")).sendKeys("mummy ilu");
		pdriver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
}
