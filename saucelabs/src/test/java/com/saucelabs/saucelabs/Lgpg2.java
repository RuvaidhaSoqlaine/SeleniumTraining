package com.saucelabs.saucelabs;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lgpg2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		//Fluent Wait
		
		Wait<WebDriver>w=new FluentWait(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3)).withMessage("Increase the wait").ignoring(NoSuchElementException.class);
		
		WebElement element=w.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
		element.click();
		
		
		
		
		
		
		
		
		/*WebElement b=driver.findElement(By.id("login-button"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(b));
		element.click();*/
		
       // (OR) WebElement b=new WebDriverWait(driver,Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(b));

	}

}
