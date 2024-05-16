package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginVerifyPage {
	
	WebDriver driver;
	
	By username=By.xpath("//input[@id='user-name']");
	By password=By.xpath("//input[@id='password']");
	By loginbtn=By.xpath("//input[@id='login-button']");
	
	public LoginVerifyPage(WebDriver driver) {             //constructor
		this.driver=driver;
	}
	
	public void logtoSwag(String uid, String pwd) {
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbtn).click();
	}
	
	
	public void typeusername(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typepassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickbtn() {
		driver.findElement(loginbtn).click();
	}
	

}
