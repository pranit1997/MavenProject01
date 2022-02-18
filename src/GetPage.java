import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testing software\\Testing tools\\chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://digicamp-jnmc.adcclms.com/");
        Thread.sleep(500);
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("trainer");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type = 'submit' ]")).click();
        Thread.sleep(5000);
        Actions action = new Actions(driver);
       WebElement slider =  driver.findElement(By.xpath("//div[@id = 'nav-bar']"));
       slider.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text() = 'Courses']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//h6[text() = 'Training_Student']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[text() = 'sauhea']")).click();
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        driver.findElement(By.xpath("//a[text() = 'Join']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(String.valueOf(0));
   driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Pranit");
   Thread.sleep(500);
   driver.findElement(By.xpath("//input[@value = 'Join']")).click();
    }
}
