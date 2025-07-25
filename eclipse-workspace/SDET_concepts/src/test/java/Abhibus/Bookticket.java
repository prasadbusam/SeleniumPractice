package Abhibus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookticket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[placeholder='Leaving From']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[placeholder='Going To']")).sendKeys("Machilipatnam");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[placeholder='Onward Journey Date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='31'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();

	}

}
