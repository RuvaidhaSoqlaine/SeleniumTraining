package PoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStack {

	
	
	WebDriver driver;
	By home=By.id("signupModalProductButton");
	By name=By.id("user_full_name");
	By email=By.id("user_email_login");
	By pass=By.id("user_password");
	By box=By.id("tnc_checkbox");  
	By submit=By.id("user_submit");
	
	public BrowserStack(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickhome() {
		driver.findElement(home).click();
		
	}
	
	public void clickname() {
		driver.findElement(name).sendKeys("Ruvaidha Soqlaine");
	}
	
	public void clickemail() {
		driver.findElement(email).sendKeys("someemail@gmail.com");
	}
	
	public void clickpass() {
		driver.findElement(pass).sendKeys("pasword12345");
	}
	
	public void clickbox() {
		driver.findElement(box).click();
	}
	
	public void clicksubmit() {
		driver.findElement(submit).click();
	}

}
