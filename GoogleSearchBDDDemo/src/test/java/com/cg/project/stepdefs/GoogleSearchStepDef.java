package com.cg.project.stepdefs;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cg.project.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
	
	private WebDriver driver;
	
	@Before
	public void setupScenarioEnv() {	
		driver=DriverFactory.getDriver();	
	}


	@Given("User should open Google Home Page")
	public void user_should_open_Google_Home_Page() {
		driver.get("https://www.google.co.in/");
	}

	@When("User enterd {string} in search box")
	public void user_enterd_in_search_box(String string) {
	WebElement searchBox =driver.findElement(By.name("q"));
	searchBox.sendKeys(string);
	}

	@When("click on submit button") 
	public void click_on_submit_button() {
		WebElement submitBtn = driver.findElement(By.name("btnK"));
		submitBtn.submit();
	  }
	 
	@Then("Multiple Links should be displayed on {string} topic")
	public void multiple_Links_should_be_displayed_on_topic(String string) {
	String actualTitle = driver.getTitle();
	String expectedTitle = string+" - Google Search";             //Agile Methodolgy - Google Search
	assertEquals(actualTitle, expectedTitle);
	//System.out.println(actualTitle);

	}

	@When("User enterd {string} in serach box")
	public void user_enterd_in_serach_box(String string) {
		WebElement searchBox1 = driver.findElement(By.name("q"));
		searchBox1.sendKeys(string);
	}

	@Then("google should display map between {string} and also display the distance in KM")
	public void google_should_display_map_between_and_also_display_the_distance_in_KM(String string) {
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = string+" - Google Search";             
		assertEquals(actualTitle1, expectedTitle1);
	}

	@Given("User should open Google translater page")
	public void user_should_open_Google_translater_page() {
		driver.get("https://translate.google.co.in/");
	}

	@When("User enterd {string} into {string} language and select {string} language")
	public void user_enterd_into_language_and_select_language(String string, String string1, String string2) throws InterruptedException {
			//string
		
			WebElement typeBox = driver.findElement(By.className("er8xn"));
			typeBox.sendKeys(string);
			Thread.sleep(5000);
			
			//string1
			driver.findElement(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[2]/button[1]/span[1]/*[1]")).click();
			WebElement typeBox1=driver.findElement(By.className("yFQBKb"));
			typeBox1.sendKeys(string1);
			Thread.sleep(5000);
			driver.findElement(By.className("yFQBKb")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			//string2
			driver.findElement(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[5]/button[1]/span[1]/*[1]")).click();
			WebElement typeBox2=driver.findElement(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[3]/c-wiz[1]/div[2]/div[1]/div[2]/input[1]"));
			typeBox2.sendKeys(string2);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[3]/c-wiz[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
	}

	@Then("Google translater should display {string} into {string} language")
	public void google_translater_should_display_into_language(String string, String string2) {

	}
	
	@After
	public void tearDownScenarioEnv() {
		driver.quit();
	}
}
