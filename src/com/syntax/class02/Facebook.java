package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("ABD@com");

		driver.findElement(By.id("pass")).sendKeys("Ali123");
		driver.findElement(By.id("u_0_b")).click();    //id may change after every refresh
		

		driver.close();
	}

}



//Syntax Instructor  9:46 PM
//@here
//TC 2: Mercury Tours Registration: 
//Open chrome browser
//Go to “http://newtours.demoaut.com/”
//Click on Register Link
//Fill out all required info
//Click Submit
//User successfully registered
//(Create 2 scripts using different locators)