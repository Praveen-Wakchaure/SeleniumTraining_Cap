package com.cg.switchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSwitch {
	
	WebDriver driver;
    public AlertSwitch()
	
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void loadUrl()
	{
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	public void getTitle()
	{
		System.out.println(driver.getTitle());
		
	}
	
	public void handleAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println("Alert text is " +alert.getText());
        Thread.sleep(2000);
        alert.accept();
	}

}
