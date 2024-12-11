package workingWithSelect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void selectOptions(WebElement element,String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		MultiSelect.selectOptions(day, "16");
		Thread.sleep(1000);
		MultiSelect.selectOptions(month, "Apr");
		Thread.sleep(1000);
		MultiSelect.selectOptions(year, "1998");
		
		Thread.sleep(2000);
		driver.quit();

	}

}