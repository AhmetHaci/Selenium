package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.cssSelector("a[href*='mercuryregister']")).click();
		driver.findElement(By.cssSelector("input[name*='firstName")).sendKeys("Ahmet"); 
		driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys("HACIOS"); 
		driver.findElement(By.cssSelector("input[name*='phone")).sendKeys("987654321"); 
		driver.findElement(By.cssSelector("input[name*='userName']")).sendKeys("haci@gmail.com"); 
		
		driver.findElement(By.cssSelector("input[name*='address1")).sendKeys("321 Main St"); 
		driver.findElement(By.cssSelector("input[name*='address2']")).sendKeys("Suite 202"); 
		driver.findElement(By.cssSelector("input[name*='postalCode")).sendKeys("30041"); 
	
		driver.findElement(By.cssSelector("input[id*='email']")).sendKeys("haciyatmaz"); 
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("587963"); 
		driver.findElement(By.cssSelector("input[name*='confirmPassword']")).sendKeys("587963"); 
		driver.findElement(By.cssSelector("input[name='register']")).click();
		
		
		
	}

}
