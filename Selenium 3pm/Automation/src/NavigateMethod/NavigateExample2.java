package NavigateMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample2 {

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
		
		// Wait for next 2 second pause to go forward
		Thread.sleep(2000);
		
		// Navigate this page
		driver.get("https://www.codewithharry.com/");
		
		// Navigate forward for page CodeWithHarry
		driver.navigate().forward();
		
		// Wait for next 4 second pause to quit the browser
		Thread.sleep(4000);
		
		// Quit the browser
		driver.quit();

	}

}
