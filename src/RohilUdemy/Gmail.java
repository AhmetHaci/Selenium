package RohilUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.fanatik.com.tr/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'header\'/a")).click();
		driver.findElement(By.xpath("//*[@id=\'league-status-bar\']/div/div[2]/div[1]/div/div/div/a[3]/div[1]/i")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\'view_container\']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/a")).click();
		driver.close();

	}

}
