package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.findElement(By.name("alertbox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.name("confirmalertbox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.findElement(By.name("confirmalertbox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	
//		Given YES and clicked OK

		String text="Yes";
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().sendKeys(text);
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

//      Given YES and clicked CANCEL  		
		
		String text1="Yes";
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().sendKeys(text1);
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

//      Given NO and clicked OK  		

		String text2="No";
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().sendKeys(text2);
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
//      Given NO and clicked CANCEL  		

		String text3="No";
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().sendKeys(text3);
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}

}
