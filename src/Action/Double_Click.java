package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.out.println(" start the server");
		driver.manage().window().maximize();
		System.out.println("Maximize the browser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://demoapp.skillrary.com/product.php?product=selenium-training");
		System.out.println("successfully navigate");
		WebElement addelement = driver.findElement(By.id("add"));
		Actions action = new Actions(driver);
		action.doubleClick(addelement).perform();
		System.out.println("Succesffully double clicked");
		driver.quit();

	}

}
