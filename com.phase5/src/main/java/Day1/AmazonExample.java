package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pen drive");
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(4000);
//		WebElement checkbox = driver.findElement(By.id("p_n_size_browse-bin/1464336031"));
//		checkbox.click();
		
		driver.findElement(By.linkText("16 GB")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("HP")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		Thread.sleep(6000);
//		
//		driver.findElement(By.linkText("GPRS")).click();
//		Thread.sleep(6000);
		
		
	}
	
}
