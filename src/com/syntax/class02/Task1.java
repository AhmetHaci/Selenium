package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.linkText("REGISTER")).click();
	
	driver.findElement(By.name("firstName")).sendKeys("Ahmet");
	driver.findElement(By.name("lastName")).sendKeys("Haciosmanoglu");
	driver.findElement(By.name("phone")).sendKeys("5206648695");
	driver.findElement(By.id("userName")).sendKeys("ahmet@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("123 Main St");
	driver.findElement(By.name("city")).sendKeys("Cumming");
	driver.findElement(By.name("state")).sendKeys("Georgia");
	driver.findElement(By.name("postalCode")).sendKeys("30040");
	driver.findElement(By.linkText("Submit")).click();
	}

}
