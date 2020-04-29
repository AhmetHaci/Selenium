package RohilUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("a@yahoo.com");
//		driver.findElement(By.name("pass")).sendKeys("12345");
//		driver.findElement(By.linkText("Forgot account?")).click();
		
		
		
		

	}

}
