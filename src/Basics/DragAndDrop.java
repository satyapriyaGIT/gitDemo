package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]"));
		driver.switchTo().frame(iframe);
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		Actions action= new Actions(driver);
		action.dragAndDrop(img1, trash).perform();
		driver.quit();

	}

}
