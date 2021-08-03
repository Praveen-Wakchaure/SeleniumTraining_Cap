package com.cg.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cg.exception.BrowserNotCompatibleException;
import com.cg.util.TestUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class TestBase {
	
	public static WebDriver driver;
	Properties prop;
	String browser,baseurl;
	
	public TestBase()
	{
	prop=new Properties();
	try {
		prop.load(new FileInputStream("config//config.properties"));
		browser=prop.getProperty("browser");
		baseurl=prop.getProperty("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "driver//firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "driver//internetexplorer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			throw new BrowserNotCompatibleException("Mentioned Browser is not supported");
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (BrowserNotCompatibleException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void init()
	{
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void tearDown(Scenario sc)
	{
	if(sc.isFailed())
	{
	TestUtil.takeScreenShot();
	}
	}
	

}
