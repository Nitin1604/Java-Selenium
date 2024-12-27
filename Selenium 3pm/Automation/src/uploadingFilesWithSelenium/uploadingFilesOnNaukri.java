package uploadingFilesWithSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingFilesOnNaukri {

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.naukri.com/");
        
        WebElement registerBtn = driver.findElement(By.xpath("//a[text()='Register']"));
        registerBtn.click();
        
        JavascriptExecutor jsExe = (JavascriptExecutor) driver;
        for (int i = 0; i < 3; i++) {
            jsExe.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(3000);
        }
        
        WebElement workStatus1stHeading = driver.findElement(By.className("main-3"));
        workStatus1stHeading.click();
        
        WebElement uploadResume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
        uploadResume.click(); // Click on the upload button to trigger the file chooser dialog
        
        // File path to be uploaded
        String filePath = "C:\\Users\\ACER\\Desktop\\Resume_v5.pdf";
        
        // Copy file path to clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        
        // Use Robot class to simulate keyboard actions
        Robot robot = new Robot();
        Thread.sleep(2000); // Give some time for the file dialog to appear
        
        // Press CTRL + V to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        Thread.sleep(1000);
        
        // Press ENTER to confirm the upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(3000); // Wait for the file upload to complete
        
        driver.quit(); // Close the browser
    }
}
