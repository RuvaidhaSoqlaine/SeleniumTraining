package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;

public class LoginpageFactory {
	
	WebDriver driver;
	@FindBy(id="user-name")
	@CacheLookup
	WebElement username;
	
	@FindAll({
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(id="password"),
		@FindBy(name="password"),
		@FindBy(tagName="input")
	})
	@CacheLookup
	WebElement passw;
	
	@FindBy(how=How.XPATH,using="logbtn")
	@CacheLookup
	WebElement logbtn;
	
	public LoginpageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, LoginpageFactory.class);
	}
	
	public void sauce_lab() {
		username.sendKeys("standard_user");
		passw.sendKeys("secret_sauce");
		logbtn.click();
	}

}
