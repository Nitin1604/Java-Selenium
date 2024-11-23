package TagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchQuery {
  public static void main(String[] args) {
	  
	  // To launch the browser 
	  WebDriver driver = new ChromeDriver();
	  
	  // Maximize the browser
	  driver.manage().window().maximize();
	  
	  // To get any application 
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  // Identify the web element by using tag name
	  WebElement searchTextField = driver.findElement(By.tagName("input"));
	  
	 // search in the input with given search query
	  searchTextField.sendKeys("books");
   }
}
