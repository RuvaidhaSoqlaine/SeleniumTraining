package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFac {
	
	WebDriver driver;
	
	@FindBy(id="user-name") WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']") WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']") WebElement loginbtn;
	
	
		
	public LoginPageFac(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,LoginPageFac.class);
	}
	
	public void sauce_lab() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginbtn.click();
	}
	

}
