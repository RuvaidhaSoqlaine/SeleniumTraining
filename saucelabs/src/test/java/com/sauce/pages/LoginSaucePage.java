
package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSaucePage {
	WebDriver driver;
	
	By username=By.id("user-name");
	By password=By.xpath("//input[@id='password']");
	By loginbtn=By.xpath("//input[@id='login-button']");
	By imageclk=By.className("inventory_item_img");
	By addtocart=By.id("add-to-cart-sauce-labs-backpack");
	By remove=By.id("remove-sauce-labs-backpack");
	
	
	public LoginSaucePage(WebDriver driver) {             //constructor
		this.driver=driver;
	}
	
//	public void typeLoginbtn(String uid, String pwd) {
//		driver.findElement(username).sendKeys(uid);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(loginbtn).click();
//	}
	
//	public void typeLoginbtn() {
//		driver.findElement(username).sendKeys("standard_user");
//		driver.findElement(password).sendKeys("secret_sauce");
//		driver.findElement(loginbtn).click();
//	}
		
	
	
	
	public void typeusername() {
		driver.findElement(username).sendKeys("standard_user");
	}
	
	public void typepassword() {
		driver.findElement(password).sendKeys("secret_sauce");
	}
	
	public void clickbtn() {
		driver.findElement(loginbtn).click();
	}
	
	public void imgclk() {
		driver.findElement(imageclk).click();
	}
	
	public void addbtn() {
		driver.findElement(addtocart).click();
	}
	
	public void removeitem() {
		driver.findElement(remove).click();
	}
}
