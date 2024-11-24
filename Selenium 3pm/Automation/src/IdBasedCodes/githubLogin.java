package IdBasedCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class githubLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2FNitin1604");
		
		WebElement userNameLogin = driver.findElement(By.id("login_field"));
		userNameLogin.sendKeys("Nitin1604");
		
		WebElement passwordLogin = driver.findElement(By.id("password"));
		passwordLogin.sendKeys("202successnitin@2024");
		
		WebElement signInButton = driver.findElement(By.cssSelector("input.btn"));
		signInButton.click();
		
		WebElement repositoriesClick = driver.findElement(By.id("repositories-tab"));
		repositoriesClick.click();
		
		 	
	}

}
