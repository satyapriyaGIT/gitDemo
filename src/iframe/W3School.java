package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		String text = driver.findElement(By.xpath("//span[text()='Click the button to demonstrate the prompt box.']']")).getText();
		System.out.println(text);
		driver.quit();
	}

}
