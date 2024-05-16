package TestNgTraining.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestNgTraining.AbstractComponent.AbstractComponents;

public class LandingPage extends AbstractComponents {

	// initialization local driver
	WebDriver driver;

	public LandingPage(WebDriver driver) {

		super(driver);
		// initialization local driver to main driver
		this.driver = driver;
		// initializing all the webelements to this driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement passwordEle;

	@FindBy(id = "login")
	WebElement submit;

	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage;
	
	public ProductCatelog loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatelog productCatelog = new ProductCatelog(driver);
		return productCatelog;
	}
	
	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
		
	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
}
