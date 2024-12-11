package workingWithSelect;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		Select selectDropdown = new Select(driver.findElement(By.id("select-multiple-native")));
		
		for(int i=0;i<4;i++) {
			selectDropdown.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		selectDropdown.deselectAll();
	}

}
