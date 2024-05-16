package Step_definition;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GourmetGardenPage;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GourmetGarden {

	
	WebDriver driver=new ChromeDriver();;
	
	GourmetGardenPage cart=new GourmetGardenPage(driver);
	

@Given("user should enter into the application")
public void user_should_enter_into_the_application() {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	//driver=new ChromeDriver();
	driver.get("https://gourmetgarden.in/");
}
   
@When("user should enter the location")
public void user_should_enter_the_location() {
	cart.typelocation();
    
}

@And("user enter into the particular item")
public void user_enter_into_the_particular_item() {
	cart.typeitemneed();
	
    
}

@And("user select the item into the cart")
public void user_select_the_item_into_the_cart() {
	cart.typeitem();

    
}
@Then("click on add to cart button")
public void click_on_add_to_cart_button() {
	cart.typeaddtocart();

    
}
}
