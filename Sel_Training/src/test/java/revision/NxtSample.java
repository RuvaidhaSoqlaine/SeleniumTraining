package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NxtSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("vfb-5")).sendKeys("Ruvaidha");
		driver.findElement(By.id("vfb-7")).sendKeys("Soqlaine");
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-31-2")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("vfb-13[address]")).sendKeys("My Street Address");
		Thread.sleep(2000);

		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("My Appartment Address");
		Thread.sleep(2000);

		driver.findElement(By.id("vfb-13-city")).sendKeys("My City");
		Thread.sleep(1000);

		driver.findElement(By.id("vfb-13-state")).sendKeys("Tamil Nadu");
		Thread.sleep(1000);

		driver.findElement(By.id("vfb-13-zip")).sendKeys("000000");
		Thread.sleep(1000);

		WebElement dropdown1=driver.findElement(By.id("vfb-13-country"));
		Select click= new Select(dropdown1);
		click.selectByIndex(2);
		System.out.println(click.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		
		driver.findElement(By.name("vfb-14")).sendKeys("soqlaineruvaidha@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("vfb-18")).click();
		driver.findElement(By.xpath("//a[@data-date='29']")).click();
		Thread.sleep(1000);
		
		WebElement dropdown2=driver.findElement(By.id("vfb-16-hour"));
		Select click2= new Select(dropdown2);
		click2.selectByIndex(3);
		System.out.println(click2.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		
		WebElement dropdown3=driver.findElement(By.id("vfb-16-min"));
		Select click3= new Select(dropdown3);
		click3.selectByIndex(5);
		System.out.println(click3.getFirstSelectedOption().getText());
		Thread.sleep(1000);


		driver.findElement(By.id("vfb-19")).sendKeys("1234567890");
		Thread.sleep(1000);

		driver.findElement(By.id("vfb-20-0")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("vfb-23")).sendKeys("No Queries");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("vfb-3")).sendKeys("99");
		
		driver.findElement(By.name("vfb-submit")).click();
	}

}  
    