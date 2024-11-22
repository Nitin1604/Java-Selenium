package openAndClosing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingClosingMaximize {
	public static void main(String[] args) throws Exception {
		
		// Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open a website 
        driver.get("https://www.linkedin.com");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for a few seconds to see the browser open
        
            Thread.sleep(3000); // 3-second pause
        
        // Close the browser
        driver.quit();
		
	}

}
