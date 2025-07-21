package window_handles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[name=\'username\']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=\'password\']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		/*ArrayList <String> allid=new ArrayList(windows);
		String first=allid.get(0);
		String second=allid.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(second);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(first);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());*/
		
		/*for(String all:windows) {
			driver.switchTo().window(all);
			System.out.println(driver.getTitle());
		}*/
		
		for(String all:windows) {
			String ids=driver.switchTo().window(all).getTitle();
			if(ids.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
