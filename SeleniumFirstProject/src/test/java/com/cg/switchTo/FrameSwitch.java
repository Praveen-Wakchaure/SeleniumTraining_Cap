package com.cg.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitch {
	
	WebDriver driver;
	
	public FrameSwitch()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void loadUrl()
	{
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
	}
	public void getTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public void switchFrame()
	{
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
	}

}
