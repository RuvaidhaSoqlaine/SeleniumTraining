package com.saucelabs.saucelabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		a.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		List<WebElement> name=driver.findElements(By.tagName("input"));
		System.out.println("No of elements:" +name.size());
		
		for(int i=0;i<name.size();i++) {
			System.out.println("input.text:" +name.get(i).getAttribute("value"));
		}

	}

}
