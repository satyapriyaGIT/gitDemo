package DemoAppQsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popups {

	public static void main(String[] args) {
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable notifications");
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id("browNotButton")).click();
		driver.quit();

	}

}
