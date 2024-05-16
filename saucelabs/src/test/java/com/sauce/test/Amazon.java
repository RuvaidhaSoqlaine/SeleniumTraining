package com.sauce.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.pages.AddtoCart;
//import com.sauce.pages.AddtoCart;
import com.sauce.pages.SearchPage;

public class Amazon {
	@Test
	public void checkCart() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_6vkm4swd5x_b&adgrpid=60611463244&hvpone=&hvptwo=&hvadid=617724335923&hvpos=&hvnetw=g&hvrand=8964842330726580717&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007816&hvtargid=kwd-320833120261&hydadcr=15413_2322997&gclid=CjwKCAiAwc-dBhA7EiwAxPRylPURffBkmfkyUL4naDjVrBgXJYEPef2ePQRoszFQJYM-ynnRTLrjmxoCRrMQAvD_BwE");
		driver.manage().window().maximize();
		
		SearchPage search=new SearchPage(driver);
		//AddtoCart cart=new AddtoCart(driver);
		
		search.typesearchbar();
		Thread.sleep(1000);
		search.searchClk();
		Thread.sleep(1000);
		search.imageclk();
		Thread.sleep(1000);
		search.addbtn();
	}

}
