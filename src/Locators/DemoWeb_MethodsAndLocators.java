package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb_MethodsAndLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		String captureTheTitle = driver.getTitle();
		System.out.println("captureTheTitle:-" + captureTheTitle);
		String captureTheSessionid = driver.getWindowHandle();
		System.out.println("captureTheSessionid:-" + captureTheSessionid);
		String captureTheUrl = driver.getCurrentUrl();
		System.out.println("captureTheUrl :-" + captureTheUrl);
		String captureTheSourcecode = driver.getPageSource();
		System.out.println("captureTheSourcecode"); // its very lengthy code so that i didnot call the obj
													// ref"captureTheSourcecode"
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension captureTheHeightAndWidth = driver.manage().window().getSize();
		System.out.println("captureTheHeightAndWidth:-" + captureTheHeightAndWidth);
		driver.manage().window().setSize(new Dimension(1600, 900));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Point captureTheCursorPosition = driver.manage().window().getPosition();
		System.out.println("captureTheCursorPosition:-" + captureTheCursorPosition);
		driver.manage().window().setPosition(new Point(1500, 960));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		// driver.navigate().refresh(); /*after refresh we cant capture the AT and
		// AV.its not working*/
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("SatyaPriya");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Sahoo");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("satya20003@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Satya@2001");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Satya@2001");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		
		// in 2nd time if you want to execute then it is showing gmail is already exist
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
