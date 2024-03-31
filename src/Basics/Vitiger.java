package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vitiger {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.partialLinkText("Resources")).click();
		driver.findElement(By.partialLinkText("Contact")).click();
		String captureText = driver.findElement(By.xpath("(//p[@class='font-size-sm mb-0'])[74]")).getText();
		System.out.println(captureText );
		driver.quit();
	}
}
