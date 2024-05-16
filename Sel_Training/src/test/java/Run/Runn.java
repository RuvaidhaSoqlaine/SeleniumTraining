package Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PoM.BrowserStack;

public class Runn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		
		BrowserStack browser=new BrowserStack(driver);
		browser.clickhome();
		Thread.sleep(2000);
		
		browser.clickname();
		Thread.sleep(2000);

		browser.clickemail();
		Thread.sleep(2000);

		browser.clickpass();
		Thread.sleep(2000);

		browser.clickbox();
		Thread.sleep(2000);

		browser.clicksubmit();
		Thread.sleep(2000);

		
		
	
	}

}
