package Webtables;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        int rows = driver.findElements(By.xpath("//*[@name='BookTable']//tr")).size();
        System.out.println("No. of rows: " + rows);

        int cols = driver.findElements(By.xpath("//*[@name='BookTable']//tr[1]/th")).size();
        System.out.println("No. of columns: " + cols);

        /*for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                String value = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + r + "]/td[" + c + "]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println(); // New line after each row
        }*/
        for(int r=2;r<=rows;r++) {
        	String authorname=driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + r + "]/td[2]")).getText();
        	if(authorname.equals("Mukesh")) {
        		String bookname=driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + r + "]/td[1]")).getText();
        		System.out.println(bookname+"\t"+authorname);
        	}
        }

        driver.quit();
    }
}
