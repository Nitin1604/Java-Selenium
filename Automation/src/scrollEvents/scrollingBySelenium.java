package scrollEvents;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingBySelenium {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		
		JavascriptExecutor jsE = (JavascriptExecutor)driver;
		System.out.println("Scroll to page about to start!");
		for(int i=0;i<2;i++) {
			jsE.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			System.out.println("Scroll to page was done!");
			
		}
		
	}

}
