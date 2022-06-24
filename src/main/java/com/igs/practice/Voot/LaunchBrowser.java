package com.igs.practice.Voot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--incognito");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.voot.com/activate");
		 Thread.sleep(5000);
		 //driver.findElement(By.xpath("//img[@alt='Google Icon']")).click();
		 
	}
}
