package Datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		String month = "November";
		String year = "1996";
		String date = "16";

		while (true) {
			String currentmonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentyear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}
			// driver.findElement(By.xpath("//*[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click();
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}
		List<WebElement> allDates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//a"));
		for (WebElement ele : allDates) {
			if (ele.getText().equals(date)) {
				ele.click();
				break;
			}
		}

	}

}
