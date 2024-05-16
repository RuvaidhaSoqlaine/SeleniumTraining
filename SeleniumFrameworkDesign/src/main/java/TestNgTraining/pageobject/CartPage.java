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

public class CartPage extends AbstractComponents{	

	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
		// initialization local driver to main driver
		this.driver = driver;
		// initializing all the webelements to this driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cart h3")
	List<WebElement> cartProducts;
	
	// create webelement for checkout locator
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement Checkout; // .totalRow button

	// create list for the products available in cart
	public List<WebElement> getCartProductList(){		
		return cartProducts;
	}

	public Boolean VerifyProductDisplay(String productName) {
		// using stream check whether the selected item is present in the cart list or not
		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		return match;	
	}	
	
	public CheckOutPage goToCheckout() {
		Checkout.click();
		CheckOutPage checkout = new CheckOutPage(driver);
		return checkout;
	}
	
}
