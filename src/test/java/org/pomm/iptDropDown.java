package org.pomm;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iptDropDown extends BaseClass{
	
	
	@FindBy(id = "//a[text()='Select Product Type']")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}
	
	
	
	
	
	
	

}
