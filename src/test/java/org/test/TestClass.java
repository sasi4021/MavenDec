package org.test;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestClass extends BaseClass{
	
	
	public static void main(String[] args) {
		
	
	Launchbrowser();
	
	urlLaunch("https://omayo.blogspot.com/");
	
	implicitWait(10);
	
	
	//send keys method
	WebElement txt = driver.findElement(By.id("ta1"));
	sendKeys(txt, "Welcome");
	
	//get Text
	WebElement text = driver.findElement(By.xpath("//textarea[contains(text(),'The cat was play')]"));
	getText(text);
	
	WebElement click1 = driver.findElement(By.id("drop1"));
	click(click1);
//	
//	WebElement chk1 = driver.findElement(By.id("multiselect1"));
//	selectByVisibilityText(chk1,"volvox");
//	click(chk1);
	
	
	WebElement chk2 = driver.findElement(By.id("multiselect1"));
	selectByIndex(chk2, 1);
	
	WebElement chk3 = driver.findElement(By.xpath("//option[contains(text(),'Audi')]"));
	selectByValue(chk3, "Audi");
	
	
	//Scroll Down - xpath
//explicitWait(20);
	WebElement scrl = driver.findElement(By.xpath("//h2[text()='LoginSection']"));
	scrlollDown(scrl);
	//wait.until(ExpectedConditions.visibilityOf(scrl));
	
	//scroll up - css selector
	//explicitWait(20);
	WebElement up = driver.findElement(By.cssSelector("[class=date-header]"));
	//wait.until(ExpectedConditions.visibilityOf(up));
	scrollUp(up);
//	up.click();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Launchbrowser();
//	urlLaunch("https://www.facebook.com/");
//	
//	WebElement un = driver.findElement(By.id("email"));
//	javaExecutor(un, "sasi");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//quitBorwser();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void selectByValue(WebElement chk3, String string) {
		// TODO Auto-generated method stub
		
	}

}

