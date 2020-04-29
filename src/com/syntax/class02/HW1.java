package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {


//		TC 1: Facebook sign up: 
//			Open chrome browser
//			Go to “https://www.facebook.com/”
//			Enter first name
//			Enter last name
//			Enter mobile number
//			Click on sign up button
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Ahmet");
		driver.findElement(By.name("lastname")).sendKeys("Haciosmanoglu");
		driver.findElement(By.id("u_0_r")).sendKeys("5208956895");
		driver.findElement(By.id("u_0_w")).sendKeys("12345");
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.cssSelector("#u_0_13")).click();
		
		//Thread.sleep(5000);
		//driver.close();
		

		
	

	}

}
