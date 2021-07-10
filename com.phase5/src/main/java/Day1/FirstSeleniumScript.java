package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("raghavtoxicnation@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(4000);
		
		  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("");
		Thread.sleep(1200);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1000);
		
		String a1 = driver.getTitle();
		
		System.out.println(a1);
	}
	
}