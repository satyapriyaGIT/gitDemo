package Validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		String expectedUserName = "satyapriyasahoo07@gmail.com";
		String expectedPassword = "Satya@2001";
		String expectedPageTitle = "ShoppersStack";

		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome brwser is launched");
		driver.manage().window().maximize();
		System.out.println("browser is maximize");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		driver.get("https://www.shoppersstack.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedPageTitle)) {
			System.out.println("Successfully navigate to the URL");
		} else {
			System.out.println("Failed to navigate URL");
		}

		driver.findElement(By.id("loginBtn")).click();
		System.out.println("Successfully click to login button in home page");

		int email = driver.findElement(By.id("Email")).getLocation().getX();
		int password = driver.findElement(By.id("Password")).getLocation().getX();
		if (email == password) {
			System.out.println("aligned is same");
		} else {
			System.out.println("aligned is not same");
		}

		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.clear();
		emailTextField.sendKeys(expectedUserName);
		String actualEmail = emailTextField.getAttribute("value");
		if (actualEmail.equals(expectedUserName)) {
			System.out.println("User name textField accepted");
		} else {
			System.out.println("User name textField not accepted");
		}

		WebElement passwordText = driver.findElement(By.id("Password"));
		passwordText.clear();
		passwordText.sendKeys(expectedPassword);
		String actualPassword = passwordText.getAttribute("value");
		if (actualPassword.equals(expectedPassword)) {
			System.out.println("Password Text Field accepted");
		}
		else {
			System.out.println("Password Text Field is not accepted");
		}
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		System.out.println(" homepage is displayed");
		
		System.out.println("mission completed");
		driver.quit();
	}

}
