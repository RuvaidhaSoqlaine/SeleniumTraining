package TestNgTraining.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestNgTraining.AbstractComponent.AbstractComponents;

public class CheckOutPage extends AbstractComponents {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// initialization local driver to main driver
		this.driver = driver;
		// initializing all the webelements to this driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Select Country']")
	WebElement country;

	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;

	// create webelement for placeorder locator
	@FindBy(css = ".action__submit")
	WebElement Placeorder;

	@FindBy(css = ".hero-primary")
	WebElement ConfirmMessage;

	By results = By.cssSelector(".ta-results");

	public void selectCountry(String countryname) {
		// initialize action class
		Actions a = new Actions(driver);
		// using actions send the value in the bar and perform
		a.sendKeys(country, countryname);
		// wait till the element is visible
		waitForElementToAppear(results);
		selectCountry.click();

	}


	public void submitOrder() {

		waitForElementToBeClickable(Placeorder);
		Placeorder.click();
	}

	public String confirmMessage() {
		return ConfirmMessage.getText();

	}

}
