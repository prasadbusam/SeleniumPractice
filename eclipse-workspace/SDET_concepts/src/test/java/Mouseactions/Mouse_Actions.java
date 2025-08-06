package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		WebElement signin=driver.findElement(By.xpath("//*[text()='Sign In']"));
		Thread.sleep(5000);
		WebElement myorders=driver.findElement(By.xpath("(//*[@href='https://www.snapdeal.com/myorders'])[2]"));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(signin).moveToElement(myorders).click().build().perform();

	}

}
