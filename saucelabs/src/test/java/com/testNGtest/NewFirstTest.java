package com.testNGtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewFirstTest {
	WebDriver driver;
  @Test                                                                     //(groups="Regression") //(dependsOnMethods="SearchMethod")  //(priority =-1)
  public void LoginMethod() {                         
	  System.out.println("Login method 1");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
  }
  @Test   
  @Parameters({"username" , "password"})                                         //(groups="Sanity") //(dependsOnMethods={"SampleMethod","SampleMethod1"}) //(priority =1, invocationCount=2)
  public void SearchMethod(@Optional("name") String username,@Optional("pass") String password) {                           
	  System.out.println("Search method 2");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  
  }
  @Test (groups="Regression")                                                          //(priority =0)
  public void SampleMethod() {                           
	  System.out.println("Sample method 3");
  }
  @Test (groups="Sanity")                                                         //(enabled=false)
  public void SampleMethod1() {                           
	  System.out.println("Sample method 4");
  }
  @BeforeMethod
  public void beforeMethod() {                    
	  System.out.println("before method ");
  }

  @AfterMethod
  public void afterMethod() {                       
	  System.out.println("after method ");
  }

  @BeforeClass
  public void beforeClass() {                    
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {                          
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {                      
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {                             
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {                      
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
