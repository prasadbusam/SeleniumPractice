package Navigational_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[name=\'username\']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=\'password\']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type=\'submit\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Performance']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.quit();
		


	}

}
