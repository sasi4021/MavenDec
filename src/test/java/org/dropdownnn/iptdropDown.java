package org.dropdownnn;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pomm.iptDropDown;

public class iptdropDown extends BaseClass{
	
	
	public static void main(String[] args) {
		
		
		chromeOptions();
		Launchbrowser();
		
		urlLaunch("https://www.hdfcbank.com/");
		
		iptDropDown i = new iptDropDown();
		 
		driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']"));
		System.out.println(ele.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	 
	

}
