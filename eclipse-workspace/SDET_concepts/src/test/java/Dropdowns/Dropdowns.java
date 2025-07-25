package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement name=driver.findElement(By.cssSelector("[placeholder='Enter Name']"));
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("arguments[0].value='Prasad';",name);
		//WebElement drop=driver.findElement(By.id("country"));
		WebElement drop=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		Select sel=new Select(drop);
		//sel.selectByIndex(1);
		List<WebElement>options=sel.getOptions();
		System.out.println("print the number of options:"+options.size());
		for(WebElement op:options) {
			System.out.println("Print the options:"+op.getText());
		}

	}

}
