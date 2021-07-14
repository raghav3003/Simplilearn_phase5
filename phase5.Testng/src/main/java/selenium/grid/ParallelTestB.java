package selenium.grid;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestB {
		
	public static RemoteWebDriver driver;
	public static String appURL = "http://www.google.com";
	
	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(String browser) throws MalformedURLException {
		System.out.println("*******************");
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = Browser.getDriver(browser);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGooglePageTitleInChrome() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	
	@Test
	public void testSearchGoogle() {
		System.out.println("Opening Google..");
		driver.navigate().to(appURL);
//		driver.findElement(By.name("q")).sendKeys("Selenium Easy Grid Tutorials");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium Easy Grid Tutorials");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
//		driver.findElement(By.name("btnK")).click();
	}

	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing browser...Chrome");
			driver.quit();
		}
	}
}
