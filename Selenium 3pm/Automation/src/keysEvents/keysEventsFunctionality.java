package keysEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysEventsFunctionality {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");

		Robot robotVariable = new Robot();
		robotVariable.keyPress(KeyEvent.VK_CONTROL);
		robotVariable.keyPress(KeyEvent.VK_SHIFT);
		robotVariable.keyPress(KeyEvent.VK_I);
		
		robotVariable.keyRelease(KeyEvent.VK_CONTROL);
		robotVariable.keyRelease(KeyEvent.VK_SHIFT);
		robotVariable.keyRelease(KeyEvent.VK_I);
		
		
		
		
	}

}
