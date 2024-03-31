package JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformWindowScorlling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("flowers", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		for (;;) {
			try {
				driver.findElement(By.xpath("(//div[text()='Flower Color Meaning | Significance of ...'])[2]")).click();
				break;
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,100)");
			}
		}
		driver.quit();

	}

}