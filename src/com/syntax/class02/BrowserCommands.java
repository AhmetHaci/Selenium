package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().to("https:/www.google.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("https:/www.amazon.com");
		driver.navigate().forward();
		

	}

}
