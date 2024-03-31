package TestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("jacksonsatya25@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Satya@2001");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("men")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Skinny Men Blue Jeans']/../..//button[text()='add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("increase")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
