package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkillRary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapp.skillrary.com/");
		WebElement cars = driver.findElement(By.id("cars"));
		Select carsSelect = new Select(cars);
		System.out.println(carsSelect.isMultiple());
		carsSelect.selectByValue("90");
		carsSelect.selectByValue("99");
		carsSelect.selectByValue("199");
		Thread.sleep(2000);
		carsSelect.deselectAll();
		driver.quit();
	}

}
