package com.saucelabs.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();

		driver.switchTo().frame("packageFrame");
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'AbstractAnnotations')]"));
		a.click();
		
		//navigate
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("classFrame");
		WebElement b=driver.findElement(By.xpath("//*[@id=\"i0\"]/th/a"));
		
		//extra items for reference
		
		System.out.println(b.getAttribute("type"));
		System.out.println(b.getTagName());
		System.out.println(b.getText());
		Thread.sleep(1000);
		
		b.click();		
		
		
		
		
	}

}
