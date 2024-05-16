package com.saucelabs.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		js.executeScript("location.reload()");
		Thread.sleep(1000);
		
		WebElement d=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span"));
		
		//For click
		
		js.executeScript("arguments[0].click()",d);
		Thread.sleep(1000);
		
		//for Scrolling the page in horizontal and vertical
		
		js.executeScript("window.scrollBy(0,550)");*/
		
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Username field
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		js.executeScript("arguments[0].setAttribute('value','standard_user');",a);
		Thread.sleep(1000);
		
		Object obj=js.executeScript("return arguments[0].getAttribute('value');",a);
		
		String s1=(String)obj;
		System.out.println(s1);
		
		//password field
		
		WebElement b=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','secret_sauce');",b);
		Thread.sleep(1000);
		
		Object obj1=js.executeScript("return arguments[0].getAttribute('value');",b);
		
		String s2=(String)obj1;
		System.out.println(s2);
		
		//Login field  to click
		
		WebElement d=driver.findElement(By.id("login-button"));
		js.executeScript("arguments[0].click();",d);
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
