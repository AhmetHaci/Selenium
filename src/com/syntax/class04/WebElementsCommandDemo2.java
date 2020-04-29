package com.syntax.class04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommandDemo2 {
	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard ";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
//			
//			Iterator<WebElement>it=links.iterator();
//			while (it.hasNext()) {
//				System.out.println(it.next());
//			}

		for (WebElement link : links) {
			String newLink = link.getText();
			if (!newLink.isEmpty()) {
				System.out.println(newLink);
			}
		}
		driver.quit();
	}
}

//find elements even if you give wrong order it will not give you error it will give you an empty list

