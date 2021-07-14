package phase5.Testng.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestNG {
	WebDriver driver;
	
	@Test(priority = 0, groups = { "demo" })
	public void starting_point() {
		System.out.println("This is the starting point");
		
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
			
		driver.get("https://demoqa.com");
	}
	
	@Test(priority = 1, groups = { "demo" })
	public void checkTitle() {
		String testTitle = "ToolsQA";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
	}
	
	@Test(priority = 1, groups = { "demo" })
	public void click_element() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a")).click();
		System.out.println("Navigated to different page");
		driver.close();
	}
	
}
