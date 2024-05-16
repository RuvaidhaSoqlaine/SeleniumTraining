package TestNgTraining.pageobject;

import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestNgTraining.AbstractComponent.AbstractComponents;

public class OrderPage extends AbstractComponents{	

	WebDriver driver;
	
	public OrderPage(WebDriver driver) {
		super(driver);
		// initialization local driver to main driver
		this.driver = driver;
		// initializing all the webelements to this driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "tr td:nth-child(3)")
	List<WebElement> productNames;
	
	// create webelement for checkout locator
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement Checkout; // .totalRow button


	public Boolean VerifyOrderDisplay(String productName) {
		// using stream check whether the selected item is present in the cart list or not
		Boolean match = productNames.stream()
				.anyMatch(productNames -> productNames.getText().equalsIgnoreCase(productName));
		return match;
		
		
	}
}
