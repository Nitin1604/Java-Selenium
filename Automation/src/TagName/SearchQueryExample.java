package TagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchQueryExample {
	public static void main(String[] args)throws Exception {
		
		// Set up the Chrome WebDriver
     
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to YouTube
            driver.get("https://www.youtube.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Locate the search input using CSS Selector
            WebElement searchInput = driver.findElement(By.cssSelector("input#search"));

            // Type a search query
            searchInput.sendKeys("Selenium Tutorial");

            // Locate and click the search button using CSS Selector
            WebElement searchButton = driver.findElement(By.cssSelector("button#search-icon-legacy"));
            searchButton.click();

        }  finally {
        	// Wait for 4 second pause before quitting the application
        	Thread.sleep(4000);
        	
            // Close the browser
            driver.quit();
            
         
        }
	}

}
