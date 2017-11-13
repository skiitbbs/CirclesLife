package Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlanSwitch {
	
	WebDriver pdriver;
	
	public PlanSwitch(WebDriver driver) {
		pdriver = driver;
	}
	
	public void planswitch() {
		
		pdriver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[2]/form/div[3]/div[1]/div/input")).click();
		pdriver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[3]/div/div/div[2]/div/div[3]/div/div[9]/div/div[2]/div[7]/div[2]/form/input[2]")).click();
		
		Alert simpleAlert = pdriver.switchTo().alert();
		simpleAlert.accept();
		
	}

}
