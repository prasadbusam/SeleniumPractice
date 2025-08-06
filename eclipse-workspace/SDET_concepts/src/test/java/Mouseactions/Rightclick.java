package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick=driver.findElement(By.xpath("(//*[text()='right click me'])[1]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.contextClick(rightclick).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Cut']")).click();
		Thread.sleep(3000);
		Alert al= driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		

	}

}
