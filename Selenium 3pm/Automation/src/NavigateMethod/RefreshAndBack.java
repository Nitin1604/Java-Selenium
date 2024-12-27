package NavigateMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshAndBack {
	public static void main(String[] args)throws Exception {
		
		// Initialize the webdriver
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// This website will render first
     	driver.get("https://www.swiggy.com");
     	
     	// Wait for 2 second pause to navigate to next page
		Thread.sleep(2000);
		
		// Navigate to the next page when 2 seconds was completed
		driver.navigate().to("https://zomato.com");
		
		// Wait for next 2 second pause to navigate back
		Thread.sleep(2000);
		
		// Navigate back to previous page after 2 seconds pause
		driver.navigate().back();
		
		// Wait for next 2 seconds pause to move forward
		Thread.sleep(2000);
		
		// Navigating forward to next page after 2 seconds
		driver.navigate().forward();
		
		// Wait for next 2 seconds pause to refresh the page
		Thread.sleep(2000);
		
		// This will refresh the page when refreshing was done
		driver.navigate().refresh();
		
		// Wait for the next 2 seconds to quit the browser
		Thread.sleep(2000);
		
		// This will quit the browser.
		driver.quit();
		
		
	}

}
