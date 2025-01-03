package practiceProblems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverOverTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
		
		// Mouse hover over the "Men" tab.
		WebElement mouseHover = driver.findElement(By.className("Men"));
		Actions actionOnMenTab = new Actions(driver);
		actionOnMenTab.moveToElement(mouseHover).perform();
		
		// Mouse hover over the "Men's Top wear" Tab. 
		WebElement mouseHoverAction = driver.findElement(By.className("Dropdown"));
		Thread.sleep(2000);
		Actions actionOnInnerMenTab = new Actions(driver);
		actionOnInnerMenTab.moveToElement(mouseHoverAction).perform();
		
		
		WebElement mouseHoverActionPerformed = driver.findElement(By.className("Men_2"));
		Thread.sleep(2000);
		Actions actionOnNestedInnerMenTab = new Actions(driver);
		actionOnNestedInnerMenTab.moveToElement(mouseHoverActionPerformed).perform();
	}

}
