package phase5.Testng.Day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
		
	  driver.get("https://www.toolsqa.com");
	  Thread.sleep(1000);
	  
	  String originalTitle = driver.getTitle();
	  String testTitle = "Free QA Automation Tools Tutorial for Beginners with Examples";
	  System.out.println("Original title: " + originalTitle);
	  Assert.assertEquals(originalTitle, testTitle);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting on chrome browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Finished on chrome browser");
	  driver.close();
  }

}
