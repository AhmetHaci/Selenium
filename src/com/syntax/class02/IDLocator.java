package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://com");
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.partialLinkText("Welcome")).click(); // to get partial Link Text , After welcome (Admin) part may changes
	    Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	    
	    
		driver.close();
	}
	

	}


