package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
//		Open chrome browser
//		Navigate to “https://www.zillow.com/”
//		Navigate to “https://www.google.com/”
//		Navigate back to Zillow Page
//		Refresh current page
//		Verify url contains “Zillow”

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.zillow.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println("current url is " + driver.getCurrentUrl());
		boolean yes=driver.getCurrentUrl().contains("zillow");
		System.out.println(yes);
		Thread.sleep(5000);
		driver.close();
	}

}
