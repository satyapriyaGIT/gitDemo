package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToAddAllTheMethodUptoClose
{
	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://baskinrobbinsindia.com/");
		
		  Thread.sleep(2000); String captureUrl = driver.getCurrentUrl();
		  System.out.println(captureUrl); 
		  Thread.sleep(2000); 
		  String captureTitle =driver.getTitle(); 
		  System.out.println(captureTitle);
		 
		
		  Thread.sleep(500); 
		  /*String captureSourceCode = driver.getPageSource();
		  System.out.println(captureSourceCode);*/
		 
		driver.close();
	}
}
