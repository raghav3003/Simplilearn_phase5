package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormExample {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Raghav");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gupta");
		Thread.sleep(1000);
		
		driver.findElement(By.name("radiooptions")).click();
		
		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
		WebElement checkbox3 = driver.findElement(By.id("checkbox3"));
		
		checkbox1.click();
		Thread.sleep(1000);
		System.out.println(checkbox1.isSelected());
		
		checkbox2.click();
		Thread.sleep(1000);
		System.out.println(checkbox2.isSelected());
		
		checkbox3.click();
		Thread.sleep(1000);
		System.out.println(checkbox3.isSelected());
		
//		WebElement language = driver.findElement(By.id("msdd"));
		
		
		WebElement skillDropDown = driver.findElement(By.id("Skills")); 
		Select dropdown = new Select(skillDropDown);  
		dropdown.selectByIndex(5);
		Thread.sleep(1000);
		
		WebElement countryDropDown = driver.findElement(By.id("countries")); 
		Select dropdown2 = new Select(countryDropDown);  
		dropdown2.selectByIndex(10);
		Thread.sleep(1000);
		
		WebElement yearDropDown = driver.findElement(By.id("yearbox")); 
		Select dropdown3 = new Select(yearDropDown);  
		dropdown3.selectByValue("2000");
		Thread.sleep(1000);
		
		WebElement dayDropDown = driver.findElement(By.id("daybox")); 
		Select dropdown5 = new Select(dayDropDown);  
		dropdown5.selectByIndex(6);
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstpassword")).sendKeys("Raghav");
		driver.findElement(By.id("secondpassword")).sendKeys("Raghav");
		
		
	}
	
}
