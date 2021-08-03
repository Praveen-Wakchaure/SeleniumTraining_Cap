package com.cg.homepage;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePageSlider {
	
WebDriver driver;
	
	public HomePageSlider()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void loadUrl()
	{
			driver.get("http://practice.automationtesting.in/");
			driver.manage().window();
			
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
	
	public void slider() {
		//System.out.println("Three Slides displayed?? "+driver.findElement(By.className("n2-ss-slide-background")).isDisplayed());
//		int expected = 3;
//		int actual = driver.findElements(By.xpath("//*[@id=\"n2-ss-6\"]/div")).size();
//		assertEquals(expected, actual);
		 int exceptedSlide = 3;
		 int actualSlide = driver.findElements(By.className("n2-ss-slide-background")).size();
		 assertEquals(exceptedSlide, actualSlide);
		
		
    }
	
	
	

}
