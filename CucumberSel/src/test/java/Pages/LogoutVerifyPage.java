package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutVerifyPage {
	
	WebDriver driver;
	
	By menubtn=By.xpath("//button[@id='react-burger-menu-btn']");
	By logoutbtn=By.id("logout_sidebar_link");
	
	public LogoutVerifyPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void logout() {
		driver.findElement(menubtn).click();
		driver.findElement(logoutbtn).click();
	}

}
