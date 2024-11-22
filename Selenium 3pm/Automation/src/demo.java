import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// Open a website (e.g., Google)
        driver.get("https://www.google.com");
        
        // Wait for a few seconds to see the browser open
        try {
            Thread.sleep(5000); // 5-second pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Close the browser
        driver.quit();
	}

}
