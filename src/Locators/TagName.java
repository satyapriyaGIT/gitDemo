package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://baskinrobbinsindia.com/");
		Thread.sleep(3000);
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println(image.size());
	}

}
