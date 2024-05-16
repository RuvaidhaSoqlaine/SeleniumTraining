package com.saucelabs.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String parentHandler=driver.getWindowHandle();
		System.out.println("window:"+parentHandler);
		Thread.sleep(1000);
		
		//To open new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		
		//To open a new window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//Again go to the parent tab
		
		driver.switchTo().window(parentHandler);
		
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		

	}

}
