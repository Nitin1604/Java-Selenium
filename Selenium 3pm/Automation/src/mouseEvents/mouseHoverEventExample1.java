package mouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverEventExample1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.paytm.com/");
		
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
		Actions actionPerform = new Actions(driver);
		actionPerform.moveToElement(mouseHover).perform();
	}

}
