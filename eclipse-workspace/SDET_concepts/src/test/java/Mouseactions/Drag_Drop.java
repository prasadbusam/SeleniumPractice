package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(3000);
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(source, destination).perform();

	}

}
