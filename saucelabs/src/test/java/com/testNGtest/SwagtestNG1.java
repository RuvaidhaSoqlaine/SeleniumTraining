package com.testNGtest;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagtestNG1 {
	@Test
	public void GoogleSearch()
	{
		//System.out.println("Search the title");
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		//assertEquals(actualTitle,expectedTitle,"title mismatched");
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle, "Title mismatched");
		
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/";
		//assertEquals(actualTitle,expectedTitle,"Url mismatched");
		softAssert.assertEquals(actualUrl, expectedUrl, "Url mismatched");
		softAssert.assertAll();
		//driver.quit();
	}
	
//	@Test
//	public void SearchData()
//	{
//		System.out.println("Search the data");
//	}
//	@Test
//	public void PageData()
//	{
//		System.out.println("Search the page");
//	}

}
