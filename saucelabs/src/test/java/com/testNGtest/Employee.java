package com.testNGtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee {
	
	@Test  (dataProvider="datasets")
	public void TestOne(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}

	
	@DataProvider(name="datasets")
	public static Object[][] data(){
		return new Object[][] {
			{"123", "SQL"},
			{"124", "Selenium"},
			{"125", "Robotics"}
			};
	}
}
