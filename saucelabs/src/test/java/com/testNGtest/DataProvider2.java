package com.testNGtest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@Test (dataProvider="loginData")
	public void TestLogin(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		System.out.println("the thread ID is:+" +Thread.currentThread().getId());
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.header_label:nth-child(2) > div.app_logo")).isDisplayed());
		Thread.sleep(5000);
		
		driver.close();
	}
	
	@DataProvider (parallel=true)
	public Object[][] loginData(){
		Object [][] data=new Object[4][2];
	    data[0][0]="standard_user";
	    data[0][1]="secret_sauce";
	    
	    data[1][0]="problem_user";
	    data[1][1]="secret_sauce";
	    
	    data[2][0]="standard_user";
	    data[2][1]="secret_sauce";
	    
	    data[3][0]="standard_user";
	    data[3][1]="secret_sauce";
	    
		return data;
	    
	}

}
