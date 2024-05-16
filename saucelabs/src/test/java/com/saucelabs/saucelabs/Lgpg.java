package com.saucelabs.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lgpg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		//driver.findElement(By.id("login-button")).click();
		//Thread.sleep(1000);
		//button.submit();
		//Thread.sleep(1000);
		
		//driver.navigate().to("http://www.google.com");   browser navigate methods
		//Thread.sleep(1000);
		
		//driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Images"));
		//Thread.sleep(1000);
		
		//driver.navigate().back();
		//Thread.sleep(1000);
		
		//driver.navigate().forward();
		//Thread.sleep(1000);
		
		//driver.navigate().refresh();
		//Thread.sleep(1000);
		
		
		//driver.get("http://www.google.com/");   web driver methods
		
		//String title=driver.getCurrentUrl();
		/*System.out.println(driver.getCurrentUrl());
		
		String title=driver.getTitle();
		System.out.println("the title is:"+title);
		
		WebElement a=driver.findElement(By.id("user-name"));
		System.out.println(a.getAttribute("class"));
		System.out.println(a.getTagName());
		try {
		WebElement b=driver.findElement(By.id("login-button"));
		String logcolor=b.getCssValue("color");
		System.out.println(logcolor);
		
		}
		finally {

		
		
		
		
		driver.close();

	}*/
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		a.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		
		
		//if(b.isDisplayed())
		//{
			//b.click();
			//System.out.println("Successful Login");
		//}
		
		//System.out.println(b.isDisplayed());          Web Element Methods
		//System.out.println(b.isEnabled());
		
		Thread.sleep(1000);
		
		
		
		driver.close();
	}

}
