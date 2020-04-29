package RohilUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookByCSSselector {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("ali@yahoo.com");
	}

}
