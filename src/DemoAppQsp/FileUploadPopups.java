package DemoAppQsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement fileinput = driver.findElement(By.id("fileInput"));
		fileinput.click();
		fileinput.sendKeys("C:\\Users\\Alaka Sahoo\\Downloads\\SatyapriyaRESUMEnew");
	}

}
