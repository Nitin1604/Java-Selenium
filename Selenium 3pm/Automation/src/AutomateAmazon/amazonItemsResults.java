package AutomateAmazon;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonItemsResults {

    public static void searchAvgCalc(WebDriver driver, String searchQuery, int itemLimit) throws InterruptedException {

        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchQuery);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000); 

        
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        int sum = 0, count = 0;

        for (int i = 0; i < priceElements.size(); i++) {
            if (count >= itemLimit) {
                break;
            }
            String priceText = priceElements.get(i).getText().replace(",", "");
            if (!priceText.isEmpty()) {
                sum += Integer.parseInt(priceText);
                count++;
            }
        }

       
        if (count > 0) {
            System.out.println("Search: " + searchQuery + " | Average Price: " + (sum / count));
        } else {
            System.out.println("No prices found for search: " + searchQuery);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String[] searchItemsQuery = {"clothes", "car", "mobile", "laptop"};
        for (String items : searchItemsQuery) {
            searchAvgCalc(driver, items, 5);
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
