package practiceSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class fillingForm {
    public static void main(String[] args) throws InterruptedException {
       
    	// Initialize the webDriver
    	WebDriver driver = new ChromeDriver();
    	
    	// Maximize the window
        driver.manage().window().maximize();
        
        driver.get("https://demoapps.qspiders.com/ui");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Name text field in "Register" page.
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
        Thread.sleep(2000);
       nameField.sendKeys("Ketan Singh");
       
       // Email text field in "Register" page
       WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
       Thread.sleep(2000);
       emailField.sendKeys("ketansingh@gmail.com");
       
       // Password text field in "Register" page
       WebElement pwdField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
       Thread.sleep(2000);
       pwdField.sendKeys("ketansingh456");
       
       WebElement svgIcon = driver.findElement(By.className("text-slate-600"));
       Thread.sleep(2000);
       svgIcon.click();
       
       WebElement svgIcon2 = driver.findElement(By.className("text-slate-600"));
       Thread.sleep(2000);
       svgIcon2.click();
       
       WebElement registerBtn = driver.findElement(By.xpath("//button[text()='Register']"));
       Thread.sleep(3000);
       registerBtn.click();
       
       // Entering email id in "login" page
       WebElement loginEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
       Thread.sleep(2000);
       loginEmailField.sendKeys("ketansingh@gmail.com");
       
       // Entering password in "login" page
       WebElement loginPwdField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
       Thread.sleep(2000);
       loginPwdField.sendKeys("ketansingh456");
       
       // Clicking on "eyeSvg" in "login" page
       WebElement svgIcon3 = driver.findElement(By.className("text-slate-600"));
       Thread.sleep(2000);
       svgIcon3.click();
       
       WebElement svgIcon4 = driver.findElement(By.className("text-slate-600"));
       Thread.sleep(2000);
       svgIcon4.click();
       
       WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
       Thread.sleep(3000);
       loginBtn.click();
       
       
       
       
    }
}
