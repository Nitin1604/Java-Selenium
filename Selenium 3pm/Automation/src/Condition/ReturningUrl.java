package Condition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturningUrl {
    public static void main(String[] args) throws Exception {

        // To launch the browser
        WebDriver driver = new ChromeDriver();

        // To launch the application
        driver.get("https://www.codewithharry.com");

        // To maximize the window
        driver.manage().window().maximize();

        // To print the title
        String actual_title = driver.getTitle();
        System.out.println("Actual Title: " + actual_title);

        // Expected title from any website
        String expected_title = "Learn to code online - CodeWithHarry";

        if (actual_title.equals(expected_title))
            System.out.println("Website exists");
        else
            System.out.println("Wrong website entered!");

        // To return the URL
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual URL: " + actualUrl);

        if (actualUrl.equals("https://www.codewithharry.com/"))
            System.out.println("Home page is displayed");
        else
            System.out.println("Home page is not displayed");

        // Wait for a few seconds to see the browser open
        Thread.sleep(5000); // 5-second pause

        // Close the browser
        driver.quit();
    }
}
