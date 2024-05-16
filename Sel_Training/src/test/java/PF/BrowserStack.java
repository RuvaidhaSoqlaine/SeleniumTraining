package PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStack {

	WebDriver driver;
	
	@FindBy(id="signupModalProductButton")WebElement home;
	@FindBy(id="user_full_name")WebElement name;
	@FindBy(id="user_email_login")WebElement email;
	@FindBy(id="user_password")WebElement pass;
	@FindBy(id="tnc_checkbox")WebElement box;
	@FindBy(id="user_submit")WebElement submit;


	public BrowserStack(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, BrowserStack.class);
	}
	
	
	public void clickhome() {
		home.click();
	}
	
	public void clickname() {
		name.sendKeys("Ruvaidha Soqlaine");
	}
	
	public void clickemail() {
		email.sendKeys("someemail@gmail.com");
	}
	
	public void clickpass() {
		pass.sendKeys("pasword12345");
	}
	
	public void clickbox() {
		box.click();
	}
	
	public void clicksubmit() {
		submit.click();
	}
	
	
}
