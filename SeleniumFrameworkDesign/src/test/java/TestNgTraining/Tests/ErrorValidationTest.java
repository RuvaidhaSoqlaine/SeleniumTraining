package TestNgTraining.Tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestNgTraining.TestComponents.TestComponent;
import TestNgTraining.pageobject.CartPage;
import TestNgTraining.pageobject.ProductCatelog;

public class ErrorValidationTest extends TestComponent {

	@Test(groups= {"ErrorHandling"})
	public void SubmitOrder() throws IOException {
		String productName = "ZARA COAT 3";
		landingPage.loginApplication("someone@gmail.com", "Someone@1");
		Assert.assertEquals("Incorrect email password.", landingPage.getErrorMessage());

	}

	@Test
	public void ProductErrorValidation() throws IOException {
		String productName = "ZARA COAT 3";
		ProductCatelog productCatelog = landingPage.loginApplication("someone@gmail.com", "Someone@1");
		List<WebElement> products = productCatelog.getProductList();
		productCatelog.addProductToCart(productName);
		CartPage cartpage = productCatelog.goToCartPage();

		cartpage.getCartProductList();
		Boolean match = cartpage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);

	}

}
