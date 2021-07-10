package Day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserExample {

	public static void main(String[] args) throws InterruptedException{
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		Thread.sleep(1000);
		
		String MainWindow = driver.getWindowHandle();
		System.out.println("Current Window Handle: "+MainWindow);
		
		Thread.sleep(1000);
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			System.out.println("Current Child Window handle: "+ChildWindow);
			Thread.sleep(1000);
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				Thread.sleep(1000);
				driver.findElement(By.name("emailid")).sendKeys("raghav@email.com");
				Thread.sleep(1000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(1000);
				
				driver.close();
			}
		}
		
		Thread.sleep(1000);
		driver.switchTo().window(MainWindow);
		driver.close();
		
		
		
		

	}

}