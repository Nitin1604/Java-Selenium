package mouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		Actions actionPerform = new Actions(driver);
		actionPerform.clickAndHold(driver.findElement(By.className("zoom-button"))).perform();
		
		Thread.sleep(4000);
		
		actionPerform.release().perform();

	}

}
