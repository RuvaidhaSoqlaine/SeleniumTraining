package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCart {
	WebDriver driver;
	
	By addtocart=By.className("a-button-input attach-dss-atc");
	
	

	public AddtoCart(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addbtn() {
		driver.findElement(addtocart).click();
	}

}
