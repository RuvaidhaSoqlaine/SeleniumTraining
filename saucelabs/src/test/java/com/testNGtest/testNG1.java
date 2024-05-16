package com.testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG1 {
	WebDriver d;
	@Test
	
	public void A() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
	}
	@Test
	public void B() {
        d.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		d.findElement(By.name("password")).sendKeys("secret_sauce");
	}
	@Test
	public void C() {
		d.findElement(By.id("login-button")).click();
	}

}
