package configAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class electronic extends baseClass{
	@Test
	public void clickElectronic() {
		driver.findElement(By.id("electronics")).click();
		Reporter.log("successfully click on electronics", true);
		Actions action = new  Actions(driver);
		action.moveByOffset(832, 409).perform();
		action.click();
		Reporter.log("succesffuly clicked movebyOffset", true);
	}
}
