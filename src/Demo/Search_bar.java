package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_bar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("dineshBabu");
		driver.findElement(By.name("btnK")).click();
		driver.quit();
		
	}

}
