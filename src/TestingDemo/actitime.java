package TestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Satyapriya");
		driver.findElement(By.id("LastName")).sendKeys("sahoo");
		driver.findElement(By.id("Email")).sendKeys("jacksonsatya25@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Wells Forgo");
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
