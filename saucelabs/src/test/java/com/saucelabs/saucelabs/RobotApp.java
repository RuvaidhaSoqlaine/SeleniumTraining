package com.saucelabs.saucelabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotApp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		Robot robot=new Robot();            //Throws AWT exception
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
		System.out.println(a.getText());
		driver.close();
  
	}

}
