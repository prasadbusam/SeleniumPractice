package Checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//*[@class='form-check-input'] [@type='checkbox']"));
		/*
		 * for(int i=0;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 * 
		 * Thread.sleep(3000); for(int i=0;i<checkboxes.size();i++) {
		 * if(checkboxes.get(i).isSelected()) { checkboxes.get(i).click(); } }
		 */
		for (WebElement checkbox : checkboxes) {
			checkbox.click();
		}

		Thread.sleep(3000);
		for (WebElement checkbox : checkboxes) {
			checkbox.isSelected();
			checkbox.click();
		}

		driver.quit();

	}

}
