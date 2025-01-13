package DragAndDropEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		
		WebElement dragElement1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement dropElement1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement dragElement2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement dropElement2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement dragElement3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement dropElement3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		WebElement dragElement4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement dropElement4 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions actionPerform = new Actions(driver);
		actionPerform.dragAndDrop(dragElement1, dropElement1).perform();
		actionPerform.dragAndDrop(dragElement2, dropElement2).perform();
		actionPerform.dragAndDrop(dragElement3, dropElement3).perform();
		actionPerform.dragAndDrop(dragElement4, dropElement4).perform();

	}

}
