package com.sauce.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPageFac;

public class VerifyLogPf {
	@Test
	public void checklog() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		LoginPageFac Logfac=PageFactory.initElements(driver, LoginPageFac.class);
		
		Logfac.sauce_lab();
		
		//driver.close();
	}
	

}
