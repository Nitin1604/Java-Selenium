package AutomateYouTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeAutomation {
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open YouTube
            driver.get("https://www.youtube.com");
            driver.manage().window().maximize();

            // Wait for the page to load
            Thread.sleep(3000);

            // Locate the search bar and search for a term
            WebElement searchBox = driver.findElement(By.name("search_query"));
            searchBox.sendKeys("CodeWithHarry");
            
            searchBox.submit();

            // Wait for results to load
            Thread.sleep(5000);

            // Click on the first video result
            WebElement firstVideo = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
            firstVideo.click();

            // Let the video play for 5 seconds
           Thread.sleep(5000);

        }  finally {
            // Close the browser
        	//driver.quit();
        }
    }
}
