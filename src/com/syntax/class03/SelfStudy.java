package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		driver.findElement(By.name("name")).sendKeys("Ahmet");
		driver.findElement(By.name("email")).sendKeys("ahmet@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("123456789");
		driver.findElement(By.name("country")).sendKeys("usa");
		driver.findElement(By.name("company")).sendKeys("syntax");
		driver.findElement(By.name("message")).sendKeys("This is my first automation");
		
		driver.findElement(By.className("Submit")).click();
		
		driver.quit();

}
}