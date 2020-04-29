package com.syntax.class02;

public class TestWbDriver {

	public static void main(String[] args) {
		SWebDriver  driver= new TestChromeDriver();
		driver.get("https://google.com");
		driver.close();
		
		
		SWebDriver  driver2= new TestFireFoxDriver();
		driver.get("https://google.com");
		driver.close();
	}

}
