package com.saucelabs.saucelabs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login-button")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./ScreenShots/image1.png"));
		driver.quit();
		
		
		
		
		/*File SrcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile= new File("./ScreenShots/img1.png");
		
		FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("ScreenShot Successful");*/

	}

}
