package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Watches");
		Thread.sleep(1000);
		
//		WebElement category = driver.findElement(By.id("gh-cat"));
//		Select dropDown = new Select(category);
//		dropDown.selectByVisibleText("Consumer");
		WebElement category = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select dropDown = new Select(category);
		dropDown.selectByVisibleText("Consumer Electronics");		
		Thread.sleep(1000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.partialLinkText("Sony")).click();
//		driver.findElement(By.xpath("//input[@class='checkbox__control']")).click();
		
	}

}
