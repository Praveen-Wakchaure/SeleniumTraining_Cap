package com.cg.project.factory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverFactory {
	private static Properties properties;

	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream(new File(".\\Resources\\Config.properties")));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver(String browserName) {
		
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			String chromeDriverName = properties.getProperty("chromeDriverName");
			String chromeDriverPath =properties.getProperty("chromeDriverPath");
			System.setProperty(chromeDriverName, chromeDriverPath);
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			String firefoxDriverName = properties.getProperty("firefoxDriverName");
			String firefoxDriverPath =properties.getProperty("firefoxDriverPath");
			System.setProperty(firefoxDriverName, firefoxDriverPath);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		return driver;
		
	}
}
