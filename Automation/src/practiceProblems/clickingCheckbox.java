package practiceProblems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement uiTestingClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		uiTestingClick.click();
		
		WebElement checkBoxClick = driver.findElement(By.xpath("//section[text()='Check Box']"));
		Thread.sleep(2000);
		checkBoxClick.click();
		
		WebElement checkBoxSecond = driver.findElement(By.id("domain2"));
		Thread.sleep(2000);
		checkBoxSecond.click();
		
		WebElement checkBoxThird = driver.findElement(By.id("mode3"));
		Thread.sleep(2000);
		checkBoxThird.click();

		WebElement checkBoxThirdClick = driver.findElement(By.id("mode6"));
		Thread.sleep(2000);
		checkBoxThirdClick.click();
		
		WebElement continueBtn = driver.findElement(By.className("border-orange-400"));
		Thread.sleep(2000);
		continueBtn.click();
		
		
		
	}

}
