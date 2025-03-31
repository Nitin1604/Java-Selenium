package practiceSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.sdk.trace.internal.data.ExceptionEventData;

import java.time.Duration;

public class radioBtnBasedExercises {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		driver.manage().window().maximize();
		
		// Wait for the 10 seconds to load the page.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Clicking on first radio option.
		WebElement radioOpt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attended")));
		Thread.sleep(2000);
		radioOpt1.click();

		// Clicking on second radio option.
		WebElement radioOpt2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attended6")));
		Thread.sleep(2000);
		radioOpt2.click();
		
		// Clicking on third radio option.
		WebElement radioOpt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("willin2")));
		Thread.sleep(2000);
		radioOpt3.click();
		
		// Clicking on first continue button.
		WebElement continueBtn = driver.findElement(By.id("btn"));
		Thread.sleep(2000);
		continueBtn.click();
		
		// Clicking on first check box
		WebElement checkBox1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("domain1")));
		Thread.sleep(2000);
		checkBox1.click();
		
		// Clicking on second check box.
		WebElement checkBox2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("domain2")));
		Thread.sleep(2000);
		checkBox2.click();
		
		// Clicking on third check box.
		WebElement checkBox3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("domain4")));
		Thread.sleep(2000);
		checkBox3.click();
		
		// Clicking on fourth check box.
		WebElement checkBox4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mode1")));
		Thread.sleep(2000);
		checkBox4.click();
		
		// Clicking on fifth check box.
		WebElement checkBox5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mode3")));
		Thread.sleep(2000);
		checkBox5.click();
		
		// Clicking on second continue button.
		WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn2")));
		Thread.sleep(2000);		
		continueButton.click();

		// Wait for 3 second pause.
		Thread.sleep(3000);
		driver.quit();
		

	}

}
