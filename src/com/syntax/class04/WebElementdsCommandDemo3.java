package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementdsCommandDemo3 {

	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard ";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		WebElement userName=driver.findElement(By.cssSelector("input[id='txtUsername']"));
		userName.sendKeys("Admin");
		String userName2=userName.getAttribute("value");
		System.out.println(userName2);

		driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123");
		
	
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
}
}