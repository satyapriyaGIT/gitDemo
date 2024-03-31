package Locators;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustForPractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(1000);
		String captureTitle = driver.getTitle();
		System.out.println(captureTitle);
		String captureSessionId = driver.getWindowHandle();
		System.out.println(captureSessionId);
		String captureUrl = driver.getCurrentUrl();
		System.out.println(captureUrl);
		//String captureTheSource = driver.getPageSource();
		//System.out.println(captureTheSource);
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		Thread.sleep(100);
		Dimension captureTheSize = driver.manage().window().getSize();
		System.out.println(captureTheSize);
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(2000, 1600));
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Point captureThePosition = driver.manage().window().getPosition();
		System.out.println(captureThePosition);
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(2000, 150));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(4000);
		nav.forward();
		//Thread.sleep(4000);
		//nav.refresh();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("jacksonsatya25@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Satya@2001");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body._a3wf.system-fonts--body.segoe:nth-child(2) div.x9f619.x1n2onr6.x1ja2u2z div.x78zum5.xdt5ytf.x1n2onr6.x1ja2u2z div.x78zum5.xdt5ytf.x1n2onr6.xat3117.xxzkxad div.x78zum5.xdt5ytf.x1t2pt76.x1n2onr6.x1ja2u2z.x10cihs4:nth-child(1) section.x78zum5.xdt5ytf.x1iyjqo2.xg6iff7.x6ikm8r.x10wlt62:nth-child(1) main.x1qjc9v5.xvbhtw8.x9f619.x78zum5.xdt5ytf.x1iyjqo2.x2lah0s.xdj266r.x11i5rnm.xat24cr.x1mh8g0r.x182iqb8.xexx8yu.x4uap5.x18d9i69.xkhd6sd.x1n2onr6:nth-child(1) article.x1qjc9v5.x972fbf.xcfux6l.x1qhh985.xm0m39n.x9f619.x78zum5.x1q0g3np.x1iyjqo2.x2lah0s.xk390pu.xl56j7k.xg87l8a.xkrivgy.xat24cr.x1gryazu.x1ykew4q.xexx8yu.x4uap5.x1gan7if.xkhd6sd.x11njtxf.xh8yej3.x1d2lwc3 div._ab1y div._ab21:nth-child(1) div._ab3a form._ab3b div.x9f619.xjbqb8w.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.xqui205.x1n2onr6.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.xdt5ytf.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1 > div.x9f619.xjbqb8w.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.x1xmf6yo.x1e56ztr.x540dpk.x1m39q7l.x1n2onr6.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.xdt5ytf.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1:nth-child(3)")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
