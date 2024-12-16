package AutomateAmazon;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriverInfo;

public class amazonItemsResultsObtained {

    private static final String WEBSITE_URL = "https://www.amazon.in/";
    private static final String TEXT_SEARCH_HTML_ID = "twotabsearchtextbox";
    private static final String maginfierIconClick = "nav-search-submit-button";
    private static final String priceListXpath = "//span[@class='a-price-whole']";

    
    public static void searchAvgCalc(String searchQuery, int itemLimit) throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get(WEBSITE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.id(TEXT_SEARCH_HTML_ID)).sendKeys(searchQuery);
        driver.findElement(By.id(maginfierIconClick)).click();
        Thread.sleep(3000);


        List<WebElement> priceElements = driver.findElements(By.xpath(priceListXpath));
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
            System.out.println("Search: " + searchQuery + " | Average Price: " + ((float)sum / count));
        } else {
            System.out.println("No prices found for search: " + searchQuery);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        String[] searchItemsQuery = {"clothes", "car", "mobile", "laptop"};
        for (String items : searchItemsQuery) {
            searchAvgCalc(items, 5);
        }
        closeDriver();
        Thread.sleep(2000);
        System.out.println("Done processing");

    }

    private static WebDriver INSTANCE;

    public static WebDriver getDriver() {
        if(INSTANCE!=null) {
            return INSTANCE;
        }
        else {
            synchronized (amazonItemsResultsObtained.class) { // Thread safe
                if(INSTANCE == null) {
                    INSTANCE = new ChromeDriver();
                }
            }
        }
        return INSTANCE;
    }

    public static void closeDriver() {
        if(INSTANCE != null) {
            INSTANCE.quit();
        }
    }

}
