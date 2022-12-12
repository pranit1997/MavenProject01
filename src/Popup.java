import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Popup {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testing software\\Testing tools\\chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://digicamp-dmimsu.adcclms.com/");
        Thread.sleep(500);
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("student1");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        WebElement slider =  driver.findElement(By.className("collapsible"));
       slider.click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Private Files")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[normalize-space()='Add File']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\user\\Documents\\Autoit.exe");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class = \"avatar\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.linkText("Logout")).click();
        System.out.println(driver.getTitle());
        driver.close();


    }
}
