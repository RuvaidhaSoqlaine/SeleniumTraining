package com.testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	
	public WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeClass
	
	public void initializebrowser(String browser) {
		if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.chrome.driver", "‪C:\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("https://www.google.com");
	}
	
	@Test
	public void image() {
		driver.findElement(By.linkText("Images")).click();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
