package Sel_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		boolean logo=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("Logo is displayed :"+logo);
		Thread.sleep(2000);
		boolean box=driver.findElement(By.cssSelector("[name=\'username\']")).isEnabled();
		Thread.sleep(2000);
		System.out.println("User name field is enabled :"+box);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=\'username\']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=\'password\']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type=\'submit\']")).click();
		

	}

}
