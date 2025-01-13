package workingWithSelect;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectManually {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com");
		
		// Clicking on first card
		WebElement firstCardClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		firstCardClick.click();
		
		// Clicking on "Dropdown" from left sidebar
		WebElement dropdownClick = driver.findElement(By.xpath("//section[text()='Dropdown']"));
		Thread.sleep(2000);
		dropdownClick.click();
		
		// Clicking on "Multi Select" from right sidebar
		WebElement multiSelectClick = driver.findElement(By.xpath("//a[text()='Multi Select']"));
		Thread.sleep(2000);
		multiSelectClick.click();
		
        Select selectDropdown = new Select(driver.findElement(By.id("select-multiple-native")));
		
		for(int i=0;i<4;i++) {
			selectDropdown.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		selectDropdown.deselectAll();
		
		
		
	}

}