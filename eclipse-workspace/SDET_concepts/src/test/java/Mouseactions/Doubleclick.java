package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		WebElement box1=driver.findElement(By.cssSelector("#field1"));
		WebElement box2=driver.findElement(By.cssSelector("#field2"));
		WebElement text=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Thread.sleep(3000);
		box1.clear();
		Thread.sleep(3000);
		box1.sendKeys("Prasad");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(text).perform();
		
		String text1=box2.getAttribute("value");
		System.out.println("capture the text:"+text1);
		if(text1.equals("Prasad")) {
			System.out.println("Text copied");
		}else {
			System.out.println("Text not copied");
		}
		
		
		

	}

}
