package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@name='username'][@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@type='password' and @class='oxd-input oxd-input--active']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit' or @class='abc' ]")).click();
		boolean status=driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();
		System.out.println(status);
		String value=driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).getText();
		System.out.println(value);
		driver.findElement(By.xpath("(//*[contains(@class,'orangehrm-buzz-widge')])[4]")).click(); //contains is the method it will verify the partially text of the element
		driver.quit();
	}

}
