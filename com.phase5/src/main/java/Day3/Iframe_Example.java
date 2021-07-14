package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		int countFrameInsideParent = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Count of frames on the page: " + countFrameInsideParent);
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		Thread.sleep(1000);
		
		System.out.println("Inside parent frame");
		System.out.println("Parent frame is: " + driver.findElement(By.tagName("body")).getText());
		System.out.println("Number of frames inside parent: " + driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		System.out.println("Inside child frame");
		System.out.println("Child frame is: " + driver.findElement(By.tagName("body")).getText());
		System.out.println("Number of frames inside child: " + driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.close();
	}

}
