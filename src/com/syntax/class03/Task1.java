package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {
//	Using xPath ONLY
//	TC 2: Mercury Tours Registration: 
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info (skip dropdowns)
//	Click Submit
//	User successfully registered


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ahmet");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Haci");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ahmet@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Main St");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Suite 12");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Atlanta");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Georgia");
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("30040");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Georgia");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ahmedsaid80");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}

}
