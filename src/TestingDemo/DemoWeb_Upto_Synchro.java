package TestingDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoWeb_Upto_Synchro {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demowebshop.tricentis.com/");
		String captureTitle = driver.getTitle();
		System.out.println("Title is: " + captureTitle);
		String captureTheSessionId = driver.getWindowHandle();
		System.out.println("Session Id Is: " + captureTheSessionId);
		String captureUrl = driver.getCurrentUrl();
		System.out.println("URL : " + captureUrl);
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		Point Position = driver.manage().window().getPosition();
		System.out.println(" Cursor Position" + Position);
		Dimension captureSize = driver.manage().window().getSize();
		System.out.println("Height And Width: " + captureSize);
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.linkText("Log in")).click();
		WebElement ForClear = driver.findElement(By.id("Email"));
		ForClear.clear();
		ForClear.sendKeys("Jacksonsatya25@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Satya@2001");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		String text = driver.findElement(By.xpath("//strong[text()='Do you like nopCommerce?']")).getText();
		System.out.println(text);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShot/WebShop.png");
		FileHandler.copy(temp, dest);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}

}
