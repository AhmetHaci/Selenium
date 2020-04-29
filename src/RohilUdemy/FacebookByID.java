package RohilUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookByID {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("ali@yahoo.com");
		Thread.sleep(3000);
		driver.quit();

	}

}
