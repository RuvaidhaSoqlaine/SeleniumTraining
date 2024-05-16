package com.saucelabs.saucelabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demoqa.com/select-menu");
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.id("country"));
		Select s=new Select(a);
		
		List<WebElement>opt=s.getOptions();
		for(WebElement e:opt) {
			String text=e.getText();
			System.out.println(text);
			
		}
		
		System.out.println("first option selected is");
		WebElement e=s.getFirstSelectedOption();
		String first=e.getAttribute("value");
		System.out.println(first);
		
		/*boolean b=s.isMultiple();
		System.out.println(b);
		
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		
		s.selectByValue("saab");
		Thread.sleep(1000);
		
		s.selectByVisibleText("Audi");
		Thread.sleep(1000);
		
		s.deselectByValue("saab");   //now it will show current count after deselecting on option
		
		WebElement e=s.getFirstSelectedOption();
		String first=e.getAttribute("value");
		System.out.println(first);
		
		
		List<WebElement>all=s.getAllSelectedOptions();
		System.out.println(all.size());
		
		s.deselectByVisibleText("Audi");
		Thread.sleep(1000);
		
		s.deselectByIndex(0);
		Thread.sleep(1000);*/
		
		//s.deselectAll();		
		
		
		
		
		
		
		
		
		
		
		/*s.selectByIndex(0);        Single select using Rediff application
		Thread.sleep(1000);
		
		s.selectByValue("56");
		Thread.sleep(1000);
		
		s.selectByVisibleText("Denmark");*/
		

	}

}
