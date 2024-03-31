package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://en-gb.facebook.com/r.php");
		WebElement date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select yeardrop=new Select(year);
		Select monthdrop = new Select(month);
		Select datedrop = new Select(date);
		datedrop.selectByValue("1");
		monthdrop.selectByValue("4");
		yeardrop.selectByIndex(5);
		driver.quit();

	}

}
