package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.name("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("jacksonsatya25@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Satya@2001");
		driver.findElement(By.id("Login")).click();
		driver.quit();

	}

}
