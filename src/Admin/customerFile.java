package Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customerFile {
	
	public WebDriver pdriver;
	
	public customerFile(WebDriver driver) {
		pdriver = driver;
	}
	
	public void cutomersDetails() {
		
		pdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		pdriver.findElement(By.xpath("//i[@class='fa fa-users']")).click();
		pdriver.findElement(By.xpath("//*[@id='nav-accordion']/li[2]/ul/li[1]/a")).click();
		pdriver.findElement(By.xpath("//td[@style='width: 30%']/input[@name='mobile']")).sendKeys("87423620");
		pdriver.findElement(By.xpath("//td[@style='width: 30%']/input[@name='mobile']")).sendKeys(Keys.RETURN);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int rowCount= pdriver.findElements(By.xpath("//*[@id='showGeneralsActive']/tbody/tr")).size();
		System.out.println("Total number of AddOns present for the Customer is " +rowCount + ".");
		
		int j = 0;
		for(int i = 0; i <rowCount; i++) {
			
		
			WebElement addOns = pdriver.findElement(By.xpath("//*[@id='showGeneralsActive']/tbody/tr["+(j+1)+"]/td[1]"));
			
			String addOn = addOns.getText();
			j++;
			System.out.println(j+ " AddOn is: " + addOn);
			
		}
		
		int nextPlanCount = pdriver.findElements(By.xpath("//*[@id='showGeneralsFuture']/tbody/tr")).size();
		System.out.println("Total Number of AddOns for the Next Month is " +nextPlanCount+".");
		int k = 0;
		for (int i=0; i<nextPlanCount; i++) {
			
			WebElement nextAddons = pdriver.findElement(By.xpath("//*[@id=\"showGeneralsFuture\"]/tbody/tr["+(k+1)+"]/td[1]"));
			String nextAddon = nextAddons.getText();
			k++;
			
			System.out.println(k + " Next Plan is: " +nextAddon);
			
		}
		
		
	}
	
	

}
