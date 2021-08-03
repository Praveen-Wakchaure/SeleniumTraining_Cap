package com.cg.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageArrival {
	
	WebDriver driver;
	
	public HomePageArrival()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void loadUrl()
	{
			driver.get("http://practice.automationtesting.in/");
			driver.manage().window().maximize();
			
	}
	
	public void clickShop() throws InterruptedException
	{
		driver.findElement(By.linkText("Shop")).click();
		Thread.sleep(3000);
	}
	
	public void clickHome() throws InterruptedException
	{
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
	}

}
