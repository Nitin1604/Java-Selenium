package DragAndDropEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropManually {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement uiTestingClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		uiTestingClick.click();
		
		WebElement mouseActionsClick = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		mouseActionsClick.click();
		
		WebElement dragDropClick = driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		Thread.sleep(2000);
		dragDropClick.click();
		
		WebElement dragPositionClick = driver.findElement(By.xpath("//a[text()='Drag Position']"));
		Thread.sleep(2000);
		dragPositionClick.click();
		
		WebElement dragElement1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		Thread.sleep(2000);
		WebElement dropElement1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement dragElement2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		Thread.sleep(2000);
		WebElement dropElement2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement dragElement3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		Thread.sleep(2000);
		WebElement dropElement3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		WebElement dragElement4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Thread.sleep(2000);
		WebElement dropElement4 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		
		Actions actionPerform = new Actions(driver);
		actionPerform.dragAndDrop(dragElement1, dropElement1).perform();
		actionPerform.dragAndDrop(dragElement2, dropElement2).perform();
		actionPerform.dragAndDrop(dragElement3, dropElement3).perform();
		actionPerform.dragAndDrop(dragElement4, dropElement4).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
