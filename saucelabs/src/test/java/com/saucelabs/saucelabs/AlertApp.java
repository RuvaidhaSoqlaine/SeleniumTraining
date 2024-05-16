package com.saucelabs.saucelabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Register")).click();
		//Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String txt=driver.switchTo().alert().getText();
		System.out.println(txt);
		Thread.sleep(2000);
		
		//handle the alert
		
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
