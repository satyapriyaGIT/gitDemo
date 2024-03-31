package configAnnotation;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class men extends baseClass {
	@Test
	public void clickMen() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (;;) {
			try {
				driver.findElement(By.id("//h4[text()='MEN']")).click();
				Reporter.log("sucessfully navigate men ", true);
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,200)");
			}
		}
	}
}
