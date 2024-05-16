package com.sauce.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.pages.LoginSaucePage;

public class LoginVerifyTest {
	@Test
	public void VerifyLogsauce() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		LoginSaucePage login=new LoginSaucePage(driver);
		
//		login.typeLoginbtn("standard_user", "secret_sauce");
		
//      login.typeLoginbtn();
		
		
		login.typeusername();
		login.typepassword();
		login.clickbtn();
		login.imgclk();
		Thread.sleep(2000);
		login.addbtn();
		Thread.sleep(2000);
		login.removeitem();
		
		
//		driver.close();
		
	}

}
