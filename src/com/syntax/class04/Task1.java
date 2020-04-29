package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//open chrome browser
 // go to the website
 // enter valid username and password
 // click on logo button
 //then verify the logo display

public class Task1 {

	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard ";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		WebElement userName = driver.findElement(By.cssSelector("input[id='txtUsername']"));
		userName.sendKeys("Admin");

		driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement logo =driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		logo.click();
		
	if (logo.isDisplayed()) {
		System.out.println("Test case passed");
		}else {
			System.out.println("test case failed");
		}
	}
}