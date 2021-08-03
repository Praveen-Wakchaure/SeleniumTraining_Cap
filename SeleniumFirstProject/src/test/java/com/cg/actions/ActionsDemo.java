
package com.cg.actions;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ActionsDemo {
	
    WebDriver driver;
    WebElement mens,bags;
	Actions action;
	ChromeOptions options;
	
	public ActionsDemo ()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		options=new ChromeOptions();
		DesiredCapabilities ds;
//		HashMap prefs=new HashMap<String, String>();
//		prefs.put("profile.default_content_setting_values.notifications", 1);
//		options.setExperimentalOption("prefs",prefs);
		//make-default-browser
		options.addArguments("--incognito","--disable-notifications","--start-maximized");
		driver=new ChromeDriver(options);
		action=new Actions(driver);
	}
	
	public void loadUrl()
	{
		driver.get("https://www.myntra.com/");
		//driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().alert().dismiss();
		
	}
	public void getTitle() throws InterruptedException
	{
		System.out.println(driver.getTitle());
	
	}
	
	public void hoverMouse() throws InterruptedException
	{
		mens=driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]"));
		action.moveToElement(mens).perform();
		
		Thread.sleep(5000);
		
		bags=driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/li[5]/ul[1]/li[14]/a[1]"));
		action.moveToElement(bags).click().perform();
		
	}
	
	

}
