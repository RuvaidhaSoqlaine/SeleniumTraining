package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	WebDriver driver;
	
	By searchBar=By.id("twotabsearchtextbox");
	By searchClick=By.id("nav-search-submit-button");
	By imageclick=By.className("s-image");
	By addtocart=By.xpath("//span[@id=\"submit.add-to-cart\"]");
	
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typesearchbar() {
		driver.findElement(searchBar).sendKeys("iphone14");
	}
	
	public void searchClk() {
		driver.findElement(searchClick).click();
	}
	
	public void imageclk() {
		driver.findElement(imageclick).click();
	}
	
	public void addbtn() {
		driver.findElement(addtocart).click();
	}
	

}
