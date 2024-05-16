package TestNgTraining.Tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestNgTraining.pageobject.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// setup chromedriver
		WebDriverManager.chromedriver().setup();
		// initialize chrome driver
		WebDriver driver = new ChromeDriver();
		// initialize implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// open url in chrome
		driver.get("https://rahulshettyacademy.com/client");
		// maximize the web page
		driver.manage().window().maximize();
		// enter email
		driver.findElement(By.id("userEmail")).sendKeys("someone@gmail.com");
		// enter password
		driver.findElement(By.id("userPassword")).sendKeys("Someone@1");
		// click login
		driver.findElement(By.id("login")).click();		
		// create name as a string for selecting the object
		String productName = "ZARA COAT 3";
		// initialize explicit wait for 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait till all the products are visible in the page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		// collect all the element and place it in to the list as a web element named as items
		List<WebElement> items = driver.findElements(By.cssSelector(".mb-3"));
		// apply java stream method to filter the products from list and take the item
		// which we need by getting its text
		WebElement it = items.stream()
				.filter(item -> item.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);
		// after selecting the item click on add to cart
		it.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		// wait till the page is loaded
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		// wait till the blur page is hide
		// class name= ng-animating
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		// increased the performance by using the webelement in above

		// click cart button
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		// create list for the products available in cart
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cart h3"));
		// using stream check whether the selected item is present in the cart list or
		// not
		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		// validate that item is present or not
		Assert.assertTrue(match);
		// create webelement for checkout locator
		WebElement Checkout = driver.findElement(By.xpath("//button[text()='Checkout']")); // .totalRow button
		// wait.until(ExpectedConditions.elementToBeClickable(Checkout));
		// initialize jse
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scrolldown the page till the element visit
		js.executeScript("arguments[0].scrollIntoView(true);", Checkout);
		// wait until the element is able to click
		wait.until(ExpectedConditions.elementToBeClickable(Checkout));
		// click the element
		Checkout.click();
		// initialize action class
		Actions a = new Actions(driver);
		// using actions send the value in the bar and perform
		a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "India").build().perform();
		// wait till the element is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		// click INDIA element
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		// create webelement for placeorder locator
		WebElement PlaceOrder = driver.findElement(By.cssSelector(".action__submit"));
		// scrolldown the page till the element visit
		js.executeScript("arguments[0].scrollIntoView(true);", PlaceOrder);
		// wait till that element is able to click
		wait.until(ExpectedConditions.elementToBeClickable(PlaceOrder));
		// click the element
		PlaceOrder.click();
		// get the message text
		String ConfirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		// validate the text using assertions
		Assert.assertTrue(ConfirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		// close the driver
		driver.close();
	}

}
