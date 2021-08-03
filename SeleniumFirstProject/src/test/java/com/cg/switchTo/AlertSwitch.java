package com.cg.switchTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSwitch {

	
	WebDriver driver;
	
	public AlertSwitch ()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void loadUrl()
	{
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	public void getTitle() throws InterruptedException
	{
		System.out.println(driver.getTitle());
			
	}
	
	public void handleAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert text is "+alert.getText());
		Thread.sleep(2000);
		alert.accept();
	}
	
}
