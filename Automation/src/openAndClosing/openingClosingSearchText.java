package openAndClosing;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class openingClosingSearchText {
	public static void main(String[] args) {
		
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the website
            driver.get("https://www.google.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Locate the search box, enter text, and hit Enter
            WebElement searchBox = driver.findElement(By.name("q"));
            String searchText = "Selenium Tutorial";
            searchBox.sendKeys(searchText);
            searchBox.sendKeys(Keys.RETURN);

            // Wait for the results to load (implicit wait or thread sleep can be used here)
            Thread.sleep(3000); // Use WebDriverWait for better handling in real projects

            // Retrieve and print search result titles
            List<WebElement> results = driver.findElements(By.cssSelector("h3"));

            System.out.println("Search results for: " + searchText);
            for (int i = 0; i < Math.min(results.size(), 10); i++) { // Print the top 10 results
                System.out.println((i + 1) + ". " + results.get(i).getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
	}

}
