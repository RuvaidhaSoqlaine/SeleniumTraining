
package TestNgTraining.AbstractComponent;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestNgTraining.pageobject.CartPage;
import TestNgTraining.pageobject.OrderPage;

public class AbstractComponents {

	WebDriver driver;

	public AbstractComponents(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	@FindBy(css = "[routerlink*='myorders'")
	WebElement orderHeader;
	
	@FindBy(css = "[routerlink*='cart'")
	WebElement cartHeader;

	public void waitForElementToAppear(By findBy) {

		// initialize explicit wait for 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait till all the products are visible in the page
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	public void waitForWebElementToAppear(WebElement findBy) {
		// initialize explicit wait for 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait till all the products are visible in the page
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}

	public void waitForTheElementToDisappear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait till the blur page is hide
		// class name= ng-animating
		wait.until(ExpectedConditions.invisibilityOf(ele));
		// increased the performance by using the webelement in above
	}

	public void waitForElementToBeClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(Checkout));
		// initialize jse
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scrolldown the page till the element visit
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		// wait until the element is able to click
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}
	
	public CartPage goToCartPage() {
		cartHeader.click();
		CartPage cartpage = new CartPage(driver);	
		return cartpage;
	}
	
	public OrderPage goToOrderPage() {
		orderHeader.click();
		OrderPage orderPage = new OrderPage(driver);
		return orderPage;
	}


}
