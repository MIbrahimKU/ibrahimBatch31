package smart.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OpenPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
////Radio Button Example
//		WebElement BMW = driver.findElement(By.id("bmwradio"));
//		BMW.click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("benzradio")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='hondaradio']")).click();
//		//driver.findElement(By.id("hondaradio")).click();
////Select Class Example 		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@value='bmw'])[2]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//*[@value='benz'])[2]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//*[@value='honda'])[2]")).click();
// Select Multiple Class Example
		WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
		Select dropMulti = new Select(multiSelect);
		dropMulti.selectByVisibleText("Apple");
		dropMulti.selectByVisibleText("Peach");

	}

}
