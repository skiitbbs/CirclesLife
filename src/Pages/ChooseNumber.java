package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.uielements;

public class ChooseNumber {
	
	public WebDriver pdriver;
	
	public ChooseNumber(WebDriver driver) {
		pdriver = driver;
	}
	
	public void chooseFreeNumber() {
		
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath(uielements.planselectnumber)).click();
		pdriver.findElement(By.xpath(uielements.getnumbernewnumber)).click();
		pdriver.findElement(By.xpath(uielements.getnumberfreenumber)).click();
		pdriver.findElement(By.xpath(uielements.proceedbutton)).click();
		pdriver.findElement(By.xpath(uielements.proceedbutton)).click();
		
	}
	
	public void chooseGoldenNumber() {
		pdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pdriver.findElement(By.xpath(uielements.planselectnumber)).click();
		pdriver.findElement(By.xpath(uielements.getnumbernewnumber)).click();
		pdriver.findElement(By.xpath(uielements.getnumbergoldennumber)).click();
		pdriver.findElement(By.xpath(uielements.proceedbutton)).click();
		pdriver.findElement(By.xpath(uielements.proceedbutton)).click();
		
	}

}
