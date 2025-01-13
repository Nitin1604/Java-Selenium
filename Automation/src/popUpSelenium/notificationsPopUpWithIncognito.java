package popUpSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationsPopUpWithIncognito {

	public static void main(String[] args) {
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(26));
		
		driver.get("https://www.easemytrip.com/");
		

	}

}
