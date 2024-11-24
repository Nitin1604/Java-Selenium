package IdBasedCodes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		// Identify the username and pass the value.
		WebElement usernameTextField = driver.findElement(By.id("email"));
		usernameTextField.sendKeys("NitinSokhal");
	}

}
