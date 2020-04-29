package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEelementsIntro {

	
	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard ";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		WebElement userName =driver.findElement(By.cssSelector("input[id='txtUsername']"));
		userName.isDisplayed();
		userName.sendKeys("Admin");
		Thread.sleep(3000);
		
		//userName.clear(); // if there is a box to type first clear the box
		
		//userName.sendKeys("Admin");
				
		driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123"); 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(userName.isDisplayed());
		
		if (userName.isDisplayed()) {
			String message=userName.getText();
			
			if (message.equals("Ahmet")) {
				System.out.println("correct error message displayed");
			}else {
				System.out.println("incorrect error message is displayed");
			}
		}
				
				//if you see visible text on us you can use that msg to display with getmessage
	}

}
