package Assignments;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingIphonePrice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
     	ArrayList<String> iphoneList = new ArrayList<String>();
     	iphoneList.add("Apple iPhone 16 (Ultramine, 128 GB)");
     	iphoneList.add("Apple iPhone 15 Plus (Blue, 128 GB)");
     	iphoneList.add("Apple iPhone 15 Plus (Pink, 128 GB)");
     	iphoneList.add("Apple iPhone 15 Plus (Black, 256 GB)");
     	iphoneList.add("Apple iPhone 16 (Black, 256 GB)");
     	
     	for(String list:iphoneList) {
     		String path = "//div[text()='" + list + "']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']";
     		try {
     		    String price = driver.findElement(By.xpath(path)).getText();
     		    System.out.println(list + " Rs" + price);
     		} catch (Exception e) {
     		    System.out.println("Price not found for: " + list);
     		}

     	}

	}

}
