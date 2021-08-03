package com.cg.arrivalimage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrivalImageNavigation {
	
	
WebDriver driver;
	
	public ArrivalImageNavigation()
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
	
	public void clickImage() throws InterruptedException
	{
		driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
	}
	
	public void AddtoBasket() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'Add to basket')]")).click();
		Thread.sleep(3000);
	}
	
	public void Discription() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Description')]")).click();
		Thread.sleep(3000);
	}
	
	public void Review() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Reviews (0)')]")).click();
		Thread.sleep(3000);
	}
	
	
	
	
	

}
