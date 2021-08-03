package com.cg.registerPage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;

public class Register {
	
	WebDriver driver;
	
	public Register()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void loadUrl()
	{
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			
		
	}
	public void enterDetail()
	{
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("rincy");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Cheriyan");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Pune");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("123456789");
		
	}
	
	public void radioCheck()
	{
		List<WebElement>radio=driver.findElements(By.name("radiooptions"));
		Iterator<WebElement>it=radio.iterator();
		while(it.hasNext())
		{
			WebElement temp=it.next();
			if(temp.getAttribute("value").equals("FeMale"))
				temp.click();
		}
	}
	
	public void checkBoxCheck()
	{
		List<WebElement>checkbox=driver.findElements(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]//child::input"));
		Iterator<WebElement>it=checkbox.iterator();
		while(it.hasNext())
		{
			WebElement temp=it.next();
			if(temp.getAttribute("value").equals("Cricket"))
				temp.click();
		}
	}
	
	public void langCheck()
	{
	  driver.findElement(By.xpath("//div[@id='msdd']")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
	}
	
//	public void findAnchors()
//	{
//	List<WebElement>list=driver.findElements(By.tagName("a"));
//	Iterator<WebElement>it=list.iterator();
//	while(it.hasNext())
//	{
//	WebElement link=it.next();
//	Response response=RestAssured.get(link.getAttribute("href"));
//	if(response.getStatusCode()>=400)
//	{
//	System.out.println("Link is broken "+link.getText());
//	}
//	}
	
	
	public void selectCheckBox() {
		List<WebElement> categories = driver.findElements(
		By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li"));
		for (WebElement c : categories) {
		if (c.getText().contains("Backpacks") || c.getText().contains("Handbags")) {
		c.click();
		}
		}
		}

	

}
