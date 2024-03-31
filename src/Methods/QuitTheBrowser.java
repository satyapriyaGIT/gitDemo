package Methods;


import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitTheBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.wwe.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Point getPos = driver.manage().window().getPosition();
		System.out.println(getPos);
		Navigation nav=driver.navigate();
		nav.back();
		Thread.sleep(1000);
		nav.forward();
		Thread.sleep(1000);
		nav.refresh();
			
			
				
			
		
	
	}
}
