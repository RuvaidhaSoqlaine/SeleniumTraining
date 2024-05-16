package com.saucelabs.saucelabs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropApp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("demo-frame");     USing class name
		
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		Utils.CaptureScreenShot(driver, "Imaged1");
		
		
		//main code of darg and drop
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		//Extra part
		
		if(dst.getText().matches("Dropped!")) {
			System.out.println("Successful");
		}
		
		Utils.CaptureScreenShot(driver, "Imaged2");
		

	}

}
