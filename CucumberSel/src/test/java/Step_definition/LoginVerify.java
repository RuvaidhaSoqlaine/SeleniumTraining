package Step_definition;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

//import PageFactory.LoginPageFac;
//import Pages.LoginVerifyPage;
//import Pages.LogoutVerifyPage;
import io.cucumber.java.en.*;

public class LoginVerify {
	WebDriver driver=new ChromeDriver();
	
	//LoginPageFac log;
	//LogoutVerifyPage out=new LogoutVerifyPage(driver); 
	//LoginPageFac log=PageFactory.initElements(driver, LoginPageFac.class);
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		
		//log=new LoginPageFac(driver);
		//log=new LoginPageFac(driver);
		//log.sauce_lab();
		
		
		//log.typeusername("standard_user");
		//log.typepassword("secret_sauce");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
	}

	@And("click on Login button")
	public void click_on_login_button() {
		
		//log.sauce_lab();
		
		//log.clickbtn();
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user should navigate home page")
	public void user_should_navigate_home_page() {
		driver.findElement(By.xpath("//div[@id='']")).isDisplayed();
		
		driver.close();
	}


}
