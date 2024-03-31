package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sStack_login {
	public WebDriver driver;

	@Test(priority = 1, invocationCount = 3)
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("jacksonsatya25@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Satya@2001");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Reporter.log("successfully navigate to home page");
	}

	@Test(priority = 2, invocationCount = 4,threadPoolSize = 2)
	public void men() {
		driver.findElement(By.id("men")).click();
		driver.navigate().refresh();
		driver.quit();
		
	}

}
