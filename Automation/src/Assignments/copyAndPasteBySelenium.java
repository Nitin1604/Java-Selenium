package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copyAndPasteBySelenium {

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com");

       
        WebElement emailID = driver.findElement(By.id("email"));
        emailID.sendKeys("nitinsokhal@gmail.com");

        Robot robo = new Robot();

        // Ctrl key was pressed
        robo.keyPress(KeyEvent.VK_CONTROL);
        
        // Key A was pressed
        robo.keyPress(KeyEvent.VK_A);
        
        // Releasing Key A
        robo.keyRelease(KeyEvent.VK_A);
        
        // Releasing Key Control
        robo.keyRelease(KeyEvent.VK_CONTROL);
        
        // Control key was pressed
        robo.keyPress(KeyEvent.VK_CONTROL);
        
        // Key C was pressed
        robo.keyPress(KeyEvent.VK_C);
        
        // Releasing Key C
        robo.keyRelease(KeyEvent.VK_C);
        
        // Releasing Control Key
        robo.keyRelease(KeyEvent.VK_CONTROL);
        
        // Wait for 2 seconds pause to press Tab Key
        Thread.sleep(2000);
        
        // Tab key was pressed
        robo.keyPress(KeyEvent.VK_TAB);
        
        // Tab key was release
        robo.keyRelease(KeyEvent.VK_TAB);

        // Control Key was pressed
        robo.keyPress(KeyEvent.VK_CONTROL);
        
        // Control Key V was pressed
        robo.keyPress(KeyEvent.VK_V);
        
        // Release Key V
        robo.keyRelease(KeyEvent.VK_V);
        
        // Release Key Control
        robo.keyRelease(KeyEvent.VK_CONTROL);
        
        // Wait for 2 seconds pause to quit the browser
        Thread.sleep(3000);
        driver.quit();

    }
}
