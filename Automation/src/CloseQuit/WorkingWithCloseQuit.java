package CloseQuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseQuit {
	public static void main(String[] args) {
		
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window 
		driver.manage().window().maximize();
		
		// Click on pop up window
		driver.findElement(By.linkText("Open a popup window")).click();
		
		// Close method
		driver.close();
		
		// Quit method
		driver.quit();
		
	}

}
