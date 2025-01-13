package scrollEvents;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateLoginPage {
    
    public static void main(String[] args) throws InterruptedException {
        
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        // Open the target URL
        driver.get("https://www.facebook.com/r.php");

       WebElement customRadio = driver.findElement(By.xpath("//label[text()='Custom']"));
       customRadio.click();

       Thread.sleep(2000);
       driver.quit();
    }
}