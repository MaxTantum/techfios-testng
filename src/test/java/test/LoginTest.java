package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test

public class LoginTest extends BasePage {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
	}
	
	@Test(priority = 1)
	
	public void validusersShouldBeAbleToLogIn() {
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
}
	@Test(priority = 2)
	
public void invalidUsersShouldNotBeAbleToLogin() {
	
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.id("password")).sendKeys("abc1");
	driver.findElement(By.name("login")).click();
	
}
	@AfterMethod
	
	public void close() {
		driver.close();
		driver.quit();
	}
}
