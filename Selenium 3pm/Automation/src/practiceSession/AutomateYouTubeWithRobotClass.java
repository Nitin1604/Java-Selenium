package practiceSession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateYouTubeWithRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com");

		Robot r = new Robot();
		
		for (int i = 0; i <= 13; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
					
		}

		r.keyPress(KeyEvent.VK_ENTER);
		
	    for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);

		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		 
		   
	}

}