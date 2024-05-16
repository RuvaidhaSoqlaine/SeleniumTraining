package com.testNGtest;

import org.testng.annotations.Test;

public class ThirdNewTest {
	
	@Test (dataProvider= "datasets", dataProviderClass = Employee.class)
	public void TestOne(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}

}
