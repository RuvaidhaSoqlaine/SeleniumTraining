package revision;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
 		Actions a=new Actions(driver);
		
		WebElement move= driver.findElement(By.id("user_full_name"));
		a.moveToElement(move).click().sendKeys("Ruvaidha Soqlaine").build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.id("user_email_login"))).click().sendKeys("login@gmail.com").build().perform();
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.id("user_password"));
		
		a.moveToElement(pass).click().sendKeys("pasword123").build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.id("tnc_checkbox"))).click().build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.name("commit"))).click().build().perform();

	}

}
