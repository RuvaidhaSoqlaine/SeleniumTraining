package com.testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceTestng {
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test (expectedExceptions= {NoSuchElementException.class})
	public void TestLogin() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Test (timeOut=1000)
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("afterTest");
		driver.close();
	}

}
