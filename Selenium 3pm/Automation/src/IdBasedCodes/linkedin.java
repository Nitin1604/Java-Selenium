package IdBasedCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		
//		WebElement googleBtnClick = driver.findElement(By.cssSelector("div.nsm7Bb-HzV7m-LgbsSe-MJoBVe"));
//		googleBtnClick.click();
		
		WebElement googleBtnClick = driver.findElement(By.className("nsm7Bb-HzV7m-LgbsSe-MJoBVe"));
		googleBtnClick.click();

	}

}
