package com.saucelabs.saucelabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=14136646733008976363&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007816&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=EAIaIQobChMIu4HS5NmW_AIVLZVLBR3z6ApiEAAYASAAEgKwlfD_BwE");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();            //Throws AWT exception
		Thread.sleep(2000);
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		//js.executeScript("location.reload()");
		//Thread.sleep(1000);
		
		WebElement d= driver.findElement(By.id("twotabsearchtextbox"));
		
		js.executeScript("arguments[0].setAttribute('value','phone');",d);
		Thread.sleep(1000);
		
		
        Object obj=js.executeScript("return arguments[0].getAttribute('value');",d);
		
		String s1=(String)obj;
		System.out.println(s1);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		robot.keyPress(KeyEvent.VK_ENTER);     
		Thread.sleep(2000);
		
		
		

	}

}
