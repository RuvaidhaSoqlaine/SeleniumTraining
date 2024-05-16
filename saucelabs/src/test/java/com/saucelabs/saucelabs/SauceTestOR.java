package com.saucelabs.saucelabs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceTestOR {
	@Test
	public void TestOR() throws IOException {
		File src=new File("C:\\Users\\RSOQLAIN\\eclipse-workspace\\project\\saucelabs\\src\\test\\java\\com\\saucelabs\\saucelabs\\Object_Repository_properties");
	    FileInputStream fis=new FileInputStream(src);
	    Properties pro=new Properties();
	    pro.load(fis);
	    System.out.println("Property class loaded");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.xpath(pro.getProperty("sauce.login.username.xpath")))
	    .sendKeys("standard_user");
	    
	    driver.findElement(By.xpath(pro.getProperty("sauce.login.password.xpath")))
	    .sendKeys("secret_sauce");
	    
	    driver.findElement(By.xpath(pro.getProperty("sauce.login.signup.xpath"))).click();
	}
	

}
