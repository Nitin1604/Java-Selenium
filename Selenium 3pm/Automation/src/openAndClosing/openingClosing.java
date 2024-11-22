package openAndClosing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class openingClosing {
	public static void main(String[] args) throws Exception {
		
		// Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open a website (e.g., Google)
        driver.get("https://www.linkedin.com");
        
        // Wait for a few seconds to see the browser open
        
            Thread.sleep(3000); // 3-second pause
        
        // Close the browser
        driver.quit();
		
	

	}
}
