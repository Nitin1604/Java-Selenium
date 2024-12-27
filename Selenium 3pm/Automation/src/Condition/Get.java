package Condition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String[] args)throws Exception {
		
		// To launch the browser
		WebDriver driver = new ChromeDriver();
		
		// To launch the application
		driver.get("https://www.codewithharry.com");
		
		// To maximize the window
		driver.manage().window().maximize();
		
		// To print the title
		String actual_title = driver.getTitle();
		
		// Excepted title from any website
		String excepted_title = "Learn to code online - CodeWithHarry";
		
		if(actual_title.equals(excepted_title))
			System.out.println("Website exists");
		else 
			System.out.println("Wrong website entered!");
		
		  // Wait for a few seconds to see the browser open
        
            Thread.sleep(2000); // 2-second pause
    
         // Close the browser
           driver.quit();
			
	}

}