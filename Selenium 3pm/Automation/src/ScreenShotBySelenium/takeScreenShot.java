package ScreenShotBySelenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeScreenShot {

	public static void main(String[] args) throws IOException {
	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codewithharry.com");
		
		// explicit type casting
		TakesScreenshot screenShotBySelenium = (TakesScreenshot)driver;
		
		// use the method
		File src = screenShotBySelenium.getScreenshotAs(OutputType.FILE);
		
		// Create the new file
		File dest = new File("./Screenshot/cwh.png");
		
		// copy
		Files.copy(src, dest);
		

	}

}
