package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class simple {
	
	WebDriver driver=new ChromeDriver();
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	}

	@When("click on wishlist button on the top frame")
	public void click_on_wishlist_button_on_the_top_frame() {
	    driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span")).click();
	    }

	@And("User should click the new customer registered account")
	public void user_should_click_the_new_customer_registered_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user select the privacy policy")
	public void user_select_the_privacy_policy() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user click on continue button")
	public void user_click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user click on success continue button")
	public void user_click_on_success_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user click on your store logo")
	public void user_click_on_your_store_logo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user select the item")
	public void user_select_the_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user click wishlist symbol in the item")
	public void user_click_wishlist_symbol_in_the_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user click on wishlist button again")
	public void user_click_on_wishlist_button_again() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User should click the returning customer")
	public void user_should_click_the_returning_customer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user should give registered email and password")
	public void user_should_give_registered_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user click continue")
	public void user_click_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
