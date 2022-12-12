package pranit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsappWeb {public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "F:\\Testing software\\Testing tools\\chromedriver2.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://web.whatsapp.com/");
    Thread.sleep(90000);
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//div[@title=\"Search input textbox\"]")).sendKeys("Pawan Daa");
   // driver.findElement(By.xpath("//span[@class=\"matched-text i0jNr\"]")).click();
  //driver.findElement(By.cssSelector("#pane-side > div:nth-child(1) > div > div > div:nth-child(3) > div > div > div > div._3OvU8 > div._3vPI2 > div > span")).click();
    driver.findElement(By.xpath("//span[@class=\"Hy9nV\"]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@title=\"Type a message\"]")).sendKeys("Hello, " +
            "Pawan Daa" +
                    "This is automated message");
    driver.findElement(By.xpath("//span[@data-testid=\"send\"]")).click();
   /*Thread.sleep(500);
    driver.findElement(By.xpath("//div[@role=\"button\"]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("//input[@id=\":u3\"]")).sendKeys("sarthakdorlikar42@gmail.com");
    driver.findElement(By.xpath("//input[@id=\":q6\"]")).sendKeys("Test Mail");
    driver.findElement(By.xpath("//div[@id=\":rd\"]")).sendKeys("Hi Sarthak," +
            "This is automated mail." + "Kindly ignore the mail");
    driver.findElement(By.xpath("//div[@id=\":pw\"]")).click();*/
}
}
