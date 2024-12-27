package ScreenShotBySelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AutomatePaytm {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com");
		
		WebElement moviesTicket = driver.findElement(By.xpath("//img[contains(@src,'https://assetscdn1.paytm.com/images/catalog/view_item/733295/1626259710574.png')]"));
		moviesTicket.click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Noida");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DesktopMovieCitySelector_searchedArea__Q5RWQ']/descendant::div[text()='Greater Noida']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Pushpa 2: The Rule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Hindi-index-selection-dialog")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='6']")).click();
		Thread.sleep(2000);
		
		// Take screenshot of full web page
		TakesScreenshot screenShotBySelenium = (TakesScreenshot)driver;
		File src = screenShotBySelenium.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/movieTicket.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		
		// Particular Web element screenshot
		WebElement moviePoster = driver.findElement(By.xpath("//img[@alt='movie poster']"));
		File src1 = screenShotBySelenium.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshot/moviePoster.png");
		Files.copy(src1, dest1);
		Thread.sleep(3000);
		driver.quit();
				
		
	}

}
