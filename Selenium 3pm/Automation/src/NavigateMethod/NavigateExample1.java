package NavigateMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample1 {

	public static void main(String[] args)throws Exception {
		// Initialize the web driver
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
	    driver.manage().window().maximize();
	    
	    // First this url will rendered
		driver.get("https://www.youtube.com");
		
		// Wait for 2 second pause to navigate next page
		Thread.sleep(2000);
		
		// Navigate to next page
		driver.navigate().to("https://www.linkedin.com");
		
		// Wait for next 2 second pause to go back
		Thread.sleep(2000);
		
		// Navigate back
		driver.navigate().back();         

	}

}
