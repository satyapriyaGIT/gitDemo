package configAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.yaml.snakeyaml.representer.Represent;

public class baseClass {
	public WebDriver driver;

	@BeforeClass
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("successfully maximize", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		Reporter.log("successfully navigate the URL", true);
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.id("loginBtn")).click();
		Reporter.log("successfully click the home page login btn", true);
		driver.findElement(By.id("Email")).sendKeys("jacksonsatya25@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Satya@2001");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("sucessfully click the shopper login btn", true);
	}

	@AfterMethod
	public void refresh() {
		driver.navigate().refresh();
	}

	@AfterClass
	public void close() {
		Reporter.log("bye bye see you soon", true);
		driver.quit();
	}

}
