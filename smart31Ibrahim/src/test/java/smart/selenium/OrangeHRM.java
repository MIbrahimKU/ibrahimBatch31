package smart.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Open web side 
	driver.manage().window().maximize();											  // maximize web side 
	
	Thread.sleep(1000);				//this is Java Code make some delay 
	
	driver.findElement(By.name("username")).sendKeys("Admin");    //Enter User name automatic 
	driver.findElement(By.name("password")).sendKeys("admin123");	//Enter Password automatic 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	//Create a xPath and Click the login button
	//driver.findElement(By.xpath("//*[@href='/web/index.php/admin/viewAdminModule']")).click();
	//driver.findElement(By.xpath("//*[@class=oxd-text oxd-text--span oxd-main-menu-item--name]")).click();
	
}
}
