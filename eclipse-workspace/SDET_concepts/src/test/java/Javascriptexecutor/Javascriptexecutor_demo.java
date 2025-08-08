package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascriptexecutor_demo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://testautomationpractice.blogspot.com/");

        // Enter name using JS
        WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Enter Name']")));
        js.executeScript("arguments[0].value='Prasad';", name);

        // Scroll to file upload and interact
        WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='singleFileInput']")));
        js.executeScript("arguments[0].scrollIntoView();", upload);

        // Optional click (for visual confirmation)
        js.executeScript("arguments[0].click();", upload);

        // Optional file upload
        // upload.sendKeys("C:\\path\\to\\file.txt");
    }
}
