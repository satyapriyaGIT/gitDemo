package Methods;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Methods_EndtoEnd {

	public static void main(String[] args) throws Exception 
	{
		// Edge_Browser
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(1000);
		String captureTheTitle = driver.getTitle();
		System.out.println(captureTheTitle);
		Thread.sleep(1000);
		String captureTheUrl = driver.getCurrentUrl();
		System.out.println(captureTheUrl);
		/*String captureTheSourceCode = driver.getPageSource();
		System.out.println(captureTheSourceCode);*/
		//driver.close();
		//driver.quit();
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(600);
		driver.manage().window().setSize(new Dimension(370, 90));
		Thread.sleep(700);
		Dimension getDimensionSize = driver.manage().window().getSize();
				System.out.println(getDimensionSize );
		driver.manage().window().setPosition(new Point(170, 60));
		Point getPositionSize = driver.manage().window().getPosition();
		System.out.println(getPositionSize);
		/*Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();*/
		Navigation nav=driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(3000);
		
		//****************************************************************************
		// Chrome_Browser
		ChromeDriver driverr=new ChromeDriver();
		driverr.navigate().to("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		String captureTitle = driverr.getTitle();
		System.out.println(captureTitle );
		Thread.sleep(1000);
		String captureUrl = driverr.getCurrentUrl();
		System.out.println(captureUrl );
		Thread.sleep(2000);
		/*String captureSourceCode = driverr.getPageSource();
		System.out.println(captureSourceCode);*/
		/*driverr.manage().window().fullscreen();
		Thread.sleep(2000);*/
		//driver.manage().window().maximize();
		//Thread.sleep(1000);
		driverr.manage().window().setSize(new Dimension(500,600));
		Thread.sleep(1000);
		Dimension captureTheSize = driverr.manage().window().getSize();
		System.out.println(captureTheSize);
		driverr.manage().window().setPosition(new Point(170, 80));
		Thread.sleep(2000);
		Point captureTheposition = driverr.manage().window().getPosition();
		System.out.println(captureTheposition);
		Thread.sleep(1000);
		Navigation navv=driverr.navigate() ;
		navv.back();
		Thread.sleep(2000);
		navv.forward();
		Thread.sleep(2000);
		navv.refresh();
		Thread.sleep(1000);
		String captureWindowId = driverr.getWindowHandle();
		System.out.println(captureWindowId);
		Thread.sleep(500);
		driverr.quit();
		Thread.sleep(1000);
		
		// ******************************************************************
		//Firefox_browser
		FirefoxDriver div=new FirefoxDriver();
		Thread.sleep(1000);
		div.navigate().to(new URL("https://www.jpmorgan.com/global"));
		div.manage().window().maximize();
		String capture = div.getTitle();
		System.out.println(capture);
		String captureTheBrowserId = div.getWindowHandle();
		System.out.println(captureTheBrowserId );
		div.quit();
	}	
}


