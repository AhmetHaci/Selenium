package RohilUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("syntax technologies");
		driver.findElement(By.name("q")).sendKeys (Keys.ENTER);
		driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div.r > a > h3")).click();
		
		
		
		driver.findElement(By.cssSelector("#content > section > section.middle-contant > div > div.row.pt-4.pt-sm-3.pt-md-5.mt-2.justify-content-sm-around > div:nth-child(1) > div > div > p:nth-child(3) > a")).click();
		driver.findElement(By.xpath("//*[@id=\'primary-menu\']/li[7]/a")).click();
		
				driver.findElement(By.name("pseudonym_session[unique_id]")).sendKeys("ahmet.haciosmanoglu@gmail.com");
//		driver.findElement(By.name("SingleLine1")).sendKeys("Haciosmanoglu");
//		driver.findElement(By.name("Email")).sendKeys("ahmet.haciosmanoglu@gmail.com");
//		driver.findElement(By.name("countrycode")).sendKeys("5205205252");
//		driver.findElement(By.name("date")).sendKeys("09/01/1984");
		
		//Thread.sleep(2000);
		//driver.close();

	}

}
