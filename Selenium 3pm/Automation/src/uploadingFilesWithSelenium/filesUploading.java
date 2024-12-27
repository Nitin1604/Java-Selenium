package uploadingFilesWithSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filesUploading {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Navigate to the website
        driver.get("https://demoapps.qspiders.com/");

        // Click on "UI Testing Concepts"
        WebElement uiTestingHeadingClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
        uiTestingHeadingClick.click();

        // Pause to allow the next element to load
        Thread.sleep(2000);

        // Click on "Popups"
        WebElement popupClick = driver.findElement(By.xpath("//section[text()='Popups']"));
        popupClick.click();

        // Pause to allow the next element to load
        Thread.sleep(2000);

        // Click on "File Uploads"
        WebElement fileUpload = driver.findElement(By.xpath("//section[text()='File Uploads']"));
        fileUpload.click();

        // Pause to allow the file input field to appear
        Thread.sleep(2000);

        // Upload the file
        WebElement chooseFileBtn = driver.findElement(By.id("fileInput"));
        chooseFileBtn.sendKeys("C:\\Users\\ACER\\Desktop\\Resume_v5.pdf");

        // Optionally, close the browser
        Thread.sleep(2000);
        driver.quit();
    }
}
