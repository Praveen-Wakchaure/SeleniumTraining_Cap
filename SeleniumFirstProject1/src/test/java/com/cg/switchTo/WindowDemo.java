package com.cg.switchTo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {
	
	WebDriver driver;
	WebElement mens;
	
    public WindowDemo()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void loadUrl()
	{
		driver.navigate().to("http://www.myntra.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	public void getTitle()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl().contains("men"));
	}
	
	public void newTab(String xpath) throws InterruptedException 
	{
		mens=driver.findElement(By.xpath(xpath));
		mens.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(2000);
	}
	
	public void switchTab() throws InterruptedException
	{
	ArrayList<String>array=new ArrayList<String>(driver.getWindowHandles());
	for(int i=0;i<array.size();i++)
	{
	driver.switchTo().window(array.get(i));
	getTitle();
	Thread.sleep(2000);
	}
	
	}
}
