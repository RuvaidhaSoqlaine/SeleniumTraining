package com.saucelabs.saucelabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBookApp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007816%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAhqCdBhB0EiwAH8M_GhNQ_AP6-r5StCqKZgCKZXeMuxpLb7OT8fQ-IOf0fbmwNbJyzSUsphoCgE4QAvD_BwE");
		driver.manage().window().maximize();
		
		
		String current=driver.getCurrentUrl();
		System.out.println("The current URL is:"+current);
		
		String title=driver.getTitle();
		System.out.println("The current Title is:"+title);
		
		//System.out.println(driver.getTitle());
		
		Robot robot=new Robot();            //Throws AWT exception
		Thread.sleep(2000);
		
		
		WebElement a=driver.findElement(By.name("firstname"));
		a.sendKeys("Ruvaidha");
		Thread.sleep(1000);
		
		WebElement b=driver.findElement(By.name("lastname"));
		b.sendKeys("Soqlaine");
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("asruvai2707@gmail.com");
		Thread.sleep(1000);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(1000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(1000);
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("qwertyuiop");
		Thread.sleep(1000);
		
		
		//driver.findElement(By.name("birthday_day")).sendKeys("select#day>option:last-of-type");
		
		//driver.findElement(By.xpath("select#day>option:last-of-type"));
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		WebElement c=driver.findElement(By.id("day"));
		Select s=new Select(c);
		
		s.selectByIndex(26);
		Thread.sleep(1000);
		
		WebElement d=driver.findElement(By.id("month"));
		Select s1=new Select(d);
		
		s1.selectByValue("7");
		Thread.sleep(1000);
		
		WebElement e=driver.findElement(By.id("year"));
		Select s11=new Select(e);
		
		s11.selectByVisibleText("2000");
		Thread.sleep(1000);
		
		//robot.keyPress(KeyEvent.VK_DOWN);   //it will take the birth year to previous one
		//Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		/*List<WebElement>name=driver.findElements(By.tagName("span"));
		System.out.println("no.of elements:"+name.size());
		for(int i=0;i<name.size();i++) {
			System.out.println("input.text:"+name.get(i).getAttribute("value"));
		}*/
		
		Actions act=new Actions(driver);
		
		WebElement acc=driver.findElement(By.className("_58mt"));         //female
		act.moveToElement(acc).click().build().perform();
		
		/*WebElement acc1=driver.findElement(By.className("_58mt"));         //male
		act.moveToElement(acc1).click().build().perform();
		
		WebElement acc2=driver.findElement(By.className("_83kf"));         //custom
		act.moveToElement(acc2).click().build().perform();*/
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);	
		Thread.sleep(2000);
		
		//robot.keyPress(KeyEvent.VK_ENTER);      will go to learn more page
		//Thread.sleep(2000);
		
		
		driver.findElement(By.name("websubmit")).click();
		
		robot.keyPress(KeyEvent.VK_ENTER);     
		Thread.sleep(2000);
		
		
		WebElement f=driver.findElement(By.xpath("//*[@id=\"reg_error_inner\"]"));
		System.out.println(f.getText());
		Thread.sleep(3000);
		
		
		
		driver.close();
		
		
		
		

	}

}
