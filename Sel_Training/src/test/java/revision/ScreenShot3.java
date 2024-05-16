package revision;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
		Set<String> windows= driver.getWindowHandles();        //[parentId, childId]
		Iterator<String> It= windows.iterator();
		String parentId=It.next();
		String childId=It.next();
		driver.switchTo().window(childId);
		Thread.sleep(2000);

//		String prntWindow= driver.getWindowHandle();
//		 
//		Set <String> allwindow = driver.getWindowHandles();
//		Iterator <String> it= allwindow.iterator();
//		while(it.hasNext()) {
//			String childwindow=it.next();
//			if(!prntWindow.equals(childwindow)) {
//				driver.switchTo().window(childwindow);
//			}
//			
//		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./ScreenShot/.png"));
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		Thread.sleep(2000);

		driver.switchTo().window(parentId);
		Thread.sleep(2000);

		driver.quit();
	}

}
