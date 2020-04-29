package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	/*open chrome browser
	 * go to the website
	 * enter valid username
	 * leave password empty 
	 * verify error message with text "password cannot be empty"
	 */


		public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard ";

		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(URL);
			WebElement userName = driver.findElement(By.cssSelector("input[id='txtUsername']"));
			userName.sendKeys("Admin");

			WebElement password= driver.findElement(By.cssSelector("input[name*='txtPass']"));
			password.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			if (password.getText()) {
				System.out.println("correct password");
			}else {
				System.out.println("password cannot be empty");
			}
		}
	}