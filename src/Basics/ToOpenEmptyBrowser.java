package Basics;

import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenEmptyBrowser 
{
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		String captureSourceCode = driver.getPageSource();
		System.out.println(captureSourceCode);
		driver.close();
	}
}
