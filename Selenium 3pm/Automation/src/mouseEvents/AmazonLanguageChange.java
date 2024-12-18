package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class AmazonLanguageChange {

	public static void main(String[] args) throws InterruptedException {
		
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Amazon India website
            driver.get("https://www.amazon.in");
            driver.manage().window().maximize();

            // Wait for the page to load (optional but recommended)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Locate the "EN" dropdown
            WebElement enDropdown = driver.findElement(By.id("icp-nav-flyout"));

            // Hover over the "EN" dropdown
            Actions actions = new Actions(driver);
            actions.moveToElement(enDropdown).perform();

            // Wait to ensure the dropdown options are visible
            Thread.sleep(2000);

            // Locate and click the "हिन्दी" option
            WebElement hindiOption = driver.findElement(By.xpath("//span[text()='हिन्दी']"));
            hindiOption.click();

            // Wait for the language change to take effect
            Thread.sleep(5000);

            // Print success message
            System.out.println("Amazon Website's language changed to Hindi now!");
            
            Thread.sleep(2000);
            
            // Locate the "EN" dropdown
            WebElement enDropdown1 = driver.findElement(By.id("icp-nav-flyout"));
            actions.moveToElement(enDropdown1).perform();
            
            Thread.sleep(1000);
            WebElement englishOption = driver.findElement(By.xpath("//span[text()='English']"));
            englishOption.click();
            
            System.out.println("Amazon Website's language changed to English now!");

       
        } finally {
            Thread.sleep(4000);
            driver.quit();
        }

	}

}
