package smart.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(800);
		driver.findElement(By.name("q")).sendKeys("Brazil football");
		driver.findElement(By.name("btnK")).click();
		
	}
	
		

	}


