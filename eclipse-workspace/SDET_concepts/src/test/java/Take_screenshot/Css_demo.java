package Take_screenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		

	}

}
