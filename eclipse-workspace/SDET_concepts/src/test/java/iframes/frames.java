package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("//*[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name='mytext1']")).sendKeys("Playwright Automation");
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//*[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("Cypress Automation");
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//*[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("Manual testing");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement radiobtn=driver.findElement(By.xpath("(//*[@class='AB7Lab Id5V1'])[2]"));
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",radiobtn);
		WebElement checkbox=driver.findElement(By.xpath("//*[text()='Web Testing']"));
		js.executeScript("arguments[0].click();",checkbox);
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.cssSelector("[src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		WebElement keys=driver.findElement(By.cssSelector("[name='mytext4']"));
		js.executeScript("arguments[0].value='UFT';", keys);
		
		
		

	}

}
