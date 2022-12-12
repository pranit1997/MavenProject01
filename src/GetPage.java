import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GetPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testing software\\Testing tools\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin");
        Thread.sleep(500);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Pranittiwari1234@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
        Thread.sleep(500);
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Rich@2023");
        driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@role=\"button\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@id=\":u3\"]")).sendKeys("sarthakdorlikar42@gmail.com");
        driver.findElement(By.xpath("//input[@id=\":q6\"]")).sendKeys("Test Mail");
        driver.findElement(By.xpath("//div[@id=\":rd\"]")).sendKeys("Hi Sarthak," +
                "This is automated mail." + "Kindly ignore the mail");
        driver.findElement(By.xpath("//div[@id=\":pw\"]")).click();
    }
    }
