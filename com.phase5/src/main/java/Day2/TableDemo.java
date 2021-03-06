package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement tableHead = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
		System.out.println(tableHead.getText());
		
		for (int i = 1; i < 10; i++) {
			WebElement data = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]"));
			System.out.println(data.getText());
		}
	}
}