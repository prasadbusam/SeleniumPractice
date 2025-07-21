package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingalertsusingExplicitwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys("playwright");
		System.out.println(alert.getText());
		alert.accept();
		WebElement result=driver.findElement(By.cssSelector("#result"));
		System.out.println("Print the expected result:"+result.getText());
		driver.quit();
	}

}
