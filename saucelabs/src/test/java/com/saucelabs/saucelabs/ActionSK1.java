package com.saucelabs.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSK1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	
		WebElement a=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		a.sendKeys("standard_user");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
