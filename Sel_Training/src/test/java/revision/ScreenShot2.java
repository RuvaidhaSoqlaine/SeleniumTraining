package revision;

import org.openqa.selenium.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Initialize browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.saucedemo.com");
		
		// Locate the element on the web page
		WebElement logo= driver.findElement(By.id("login-button"));
		
		// Get screenshot of the visible part of the web page
		File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Convert the screenshot into BufferedImage
		BufferedImage fullScreen=ImageIO.read(ScreenShot);
		
		//Find location of the webelement logo on the page
		Point location=logo.getLocation();
		
		//Find width and height of the located element logo
		int width=logo.getSize().getWidth();
		int height=logo.getSize().getHeight();
		
		//cropping the full image to get only the logo screenshot
		BufferedImage logoimage=fullScreen.getSubimage(location.getX(), location.getY(), width, height);
		
		ImageIO.write(logoimage, "png", ScreenShot);
		
		//Save cropped Image at destination location physically.
		FileUtils.copyFile(ScreenShot,new File("C:\\projectScreenShot1\\logoScreenShot2.png"));
		
		//driver.quit();
		
	}

}
