package com.saucelabs.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement acc=driver.findElement(By.xpath("//a[@href='http://register.rediff.com/register/register.php?FormName=user_details']"));
		//act.moveToElement(acc).click().build().perform();
		//act.moveToElement(acc).doubleClick().build().perform();
		
		//act.click(acc).build().perform();
		//act.doubleClick(acc).build().perform();
		
		//act.moveToElement(acc).contextClick().build().perform();
		act.contextClick(acc).build().perform();
		
		

	}

}
