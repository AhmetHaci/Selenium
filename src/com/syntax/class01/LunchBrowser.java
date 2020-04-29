package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://google.com");
		
		driver.findElement(By.cssSelector("#tsf>div:nth-child(2) > div.A8SBwf > div.RNNXgb >div >  div.a4bIc > input")).sendKeys("Syntax technologies");
		
		driver.findElement(By.name("q")).sendKeys (Keys.ENTER);
		
		Thread.sleep(16000);

		driver.quit();
			

	}

}
