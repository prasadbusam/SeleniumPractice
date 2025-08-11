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
        //WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='singleFileInput']")));
        //WebElement upload=driver.findElement(By.xpath("//*[@id='singleFileInput']"));
        //js.executeScript("arguments[0].scrollIntoView(true);", upload);
        //upload.click();
        WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("singleFileInput")));
        js.executeScript("arguments[0].scrollIntoView(true);", upload);
        upload.sendKeys("C:\\Resume\\Prasad Busam.pdf");

        // Get the value attribute (browser will often return C:\fakepath\filename)
        String uploadedFilePath = upload.getAttribute("value");
        System.out.println("Browser stored file path: " + uploadedFilePath);

        // Extract only the file name
        String uploadedFileName = uploadedFilePath.substring(uploadedFilePath.lastIndexOf("\\") + 1);

        // Compare with expected file name
        if (uploadedFileName.equals("Prasad Busam.pdf")) {
            System.out.println("File upload successfully");
        } else {
            System.out.println("File upload not successfully");
        }


        
    }
}
