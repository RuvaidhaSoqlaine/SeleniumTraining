package TestNgTraining.Tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestNgTraining.TestComponents.TestComponent;
import TestNgTraining.pageobject.CartPage;
import TestNgTraining.pageobject.LandingPage;
import TestNgTraining.pageobject.OrderPage;
import TestNgTraining.pageobject.CheckOutPage;
import TestNgTraining.pageobject.ProductCatelog;

public class SubmitOrderTest extends TestComponent {
	String productName = "ZARA COAT 3";

	@Test(dataProvider="getData",groups={"Purchase"})
	public void submitOrder(HashMap<String,String>input ) throws IOException {
		ProductCatelog productCatelog = landingPage.loginApplication(input.get("email"),input.get("password"));
		List<WebElement> products = productCatelog.getProductList();
		productCatelog.addProductToCart(input.get("productName"));
		CartPage cartpage = productCatelog.goToCartPage();

		cartpage.getCartProductList();
		Boolean match = cartpage.VerifyProductDisplay(input.get("productName"));
		Assert.assertTrue(match);
		CheckOutPage checkout = cartpage.goToCheckout();

		checkout.selectCountry("India");
		checkout.submitOrder();
		String ConfirmMessage = checkout.confirmMessage();
		Assert.assertTrue(ConfirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}
	
	@Test (dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest() {
		ProductCatelog productCatelog = landingPage.loginApplication("someone@gmail.com", "Someone@1");
		OrderPage orderpage=productCatelog.goToOrderPage();
		Assert.assertTrue(orderpage.VerifyOrderDisplay(productName));
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//TestNgTraining//Data//PurchaseOrder.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
	
//	@DataProvider
//	public Object[][] getData() {
//		return new Object[][] {{"someone@gmail.com","Someone@1","ZARA COAT 3"},{"somepeople@gmail.com","Somepeople@1","ADIDAS ORIGINAL"}},
//	}
	
	
//	HashMap<String,String> map = new HashMap<String,String>();
//	map.put("email", "someone@gmail.com");
//	map.put("password", "Someone@1");
//	map.put("productName", "ZARA COAT 3");
//
//	HashMap<String,String> map1 = new HashMap<String,String>();
//	map1.put("email", "somepeople@gmail.com");
//	map1.put("password", "Somepeople@1");
//	map1.put("productName", "ADIDAS ORIGINAL");

}
