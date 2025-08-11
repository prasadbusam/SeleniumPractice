package Take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Screenshot_demo {

	    public static void main(String[] args) throws InterruptedException, IOException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait for username field and enter credentials
	        WebElement usernameField = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	        usernameField.sendKeys("Admin");

	        WebElement passwordField = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	        passwordField.sendKeys("admin123");

	        // Screenshot of login page
	        takeScreenshot(driver, "loginPage");

	        // Click login button
	        WebElement loginBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.cssSelector("[type='submit']")));
	        loginBtn.click();

	        // Wait for dashboard to load
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));

	        // Screenshot of dashboard page
	        takeScreenshot(driver, "dashboardPage");

	        driver.quit();
	    }

	    // Method to take screenshot
	    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
	        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File target = new File(System.getProperty("user.dir") + "\\Screenshot\\" + fileName + ".png");
	        FileUtils.copyFile(source, target);
	        System.out.println("Screenshot saved: " + target.getAbsolutePath());
	    }
	

	
//		 WebDriver driver = new ChromeDriver();
//	        driver.manage().deleteAllCookies();
//	        driver.manage().window().maximize();
//	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        WebElement usernameField = wait.until(
//	            ExpectedConditions.visibilityOfElementLocated(By.name("username"))
//	        );
//
//	        // Take screenshot after the page is ready
//	        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	        File target = new File(System.getProperty("user.dir") + "\\Screenshot\\credentialspage.png");
//	        FileUtils.copyFile(source, target);
//
//	        //System.out.println("Screenshot saved successfully at: " + target.getAbsolutePath());
//
//	        driver.quit();
	    }
	    


