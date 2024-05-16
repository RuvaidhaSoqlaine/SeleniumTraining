package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GourmetGardenPage {
	
	WebDriver driver;
	
	By location=By.xpath("//a[contains(text(),'Chennai')]");
	By itemneed=By.xpath("//body/div[@id='PageContainer']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]/img[1]");
	By item=By.id("AddToCartForm-hotpick-6837811970210");
	By addtocart=By.xpath("//body[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]/form[1]/button[1]/span[1]");
	
	
	public GourmetGardenPage(WebDriver driver) {             //constructor
		this.driver=driver;
	}
	
	
	public void typelocation() {
		
		driver.findElement(location).click();
		
	}
	
public void typeitemneed() {
		
		driver.findElement(itemneed).click();
		
	}

public void typeitem() {
	
	driver.findElement(item).click();
	
}

public void typeaddtocart() {
	
	driver.findElement(addtocart).click();
	
}
	


}
