package Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'click the button to display an  alert box')]")).click();
		Thread.sleep(1000);
		
		Alert act = driver.switchTo().alert();
		System.out.println(act.getText());
		act.dismiss();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[contains(text(), 'Alert with OK & Cancel ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(), 'click the button to display a confirm box')]")).click();
		Thread.sleep(1000);
		
		Alert act_1 = driver.switchTo().alert();
		System.out.println(act_1.getText());
		act_1.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Alert with Textbox ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(), 'click the button to demonstrate the prompt box ')]")).click();
		Thread.sleep(1000);
		
		Alert act_2 = driver.switchTo().alert();
		System.out.println(act_2.getText());
		act_2.sendKeys("Raghav");
		Thread.sleep(1000);
		
		act_2.accept();
		Thread.sleep(1000);
	}

}
