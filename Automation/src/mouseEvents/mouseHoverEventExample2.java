package mouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverEventExample2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		WebElement menTabHover = driver.findElement(By.className("desktop-main"));
		Actions actionPerform = new Actions(driver);
		actionPerform.moveToElement(menTabHover).perform();
		
		// Click on "T-shirts" column
		WebElement tShirtsClick = driver.findElement(By.className("desktop-categoryLink"));
		tShirtsClick.click();

	}

}
