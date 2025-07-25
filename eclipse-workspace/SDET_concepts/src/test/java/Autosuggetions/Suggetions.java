package Autosuggetions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suggetions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		/*js.executeScript("arguments[0].value='Python';",sea);
		List<WebElement> list=mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//div[@role='option']")));
		WebElement signout=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Stay signed out']")));
		js.executeScript("arguments[0].click();", signout);*/
		
		//driver.findElement(By.xpath("//*[text()='Stay signed out']")).click();
		List<WebElement> list=mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//div[@role='option']")));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium")) {
				list.get(i).click();
				break;
			}
		}
		
		

	}

}
