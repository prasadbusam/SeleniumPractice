package Flighticketbooking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ticketbooking {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9951156294");
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		//driver.findElement(By.xpath("//*[@class='sc-jlwm9r-0 jdWhnX']/p[@class='sc-jlwm9r-1 ewETUe']")).click();

	}

}
