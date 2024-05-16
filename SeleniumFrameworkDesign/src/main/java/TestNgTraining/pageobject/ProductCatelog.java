package TestNgTraining.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestNgTraining.AbstractComponent.AbstractComponents;

public class ProductCatelog extends AbstractComponents {

	// initialization local driver
	WebDriver driver;

	public ProductCatelog(WebDriver driver) {

		super(driver);
		// initialization local driver to main driver
		this.driver = driver;
		// initializing all the webelements to this driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".mb-3")
	List<WebElement> products;
	
	@FindBy(css = ".ng-animating")
	WebElement spinner;

	By productsBy = By.cssSelector(".mb-3");
	By addtocart= By.cssSelector(".card-body button:last-of-type");
	By toastMessage= By.cssSelector("#toast-container");
	//By cart= By.cssSelector("[routerlink*='cart']");

	
	public List<WebElement> getProductList() {
		waitForElementToAppear(productsBy);
		return products;
	}

	public WebElement getProductByName(String productName) {
		// apply java stream method to filter the products from list and take the item
		// which we need by getting its text

		WebElement prod = getProductList().stream()
				.filter(item -> item.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);

		return prod;

	}

	public void addProductToCart(String productName) {
		WebElement prod = getProductByName(productName);

		// after selecting the item click on add to cart
		prod.findElement(addtocart).click();
		// wait till the page is loaded
		waitForElementToAppear(toastMessage);
		waitForTheElementToDisappear(spinner);
		

	}

}
