package com.cg.project.stepdefs;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.project.factory.DriverFactory;
import com.cg.project.pagebeans.PaymentPageBean;
import com.cg.project.pagebeans.RegistrationPageBean;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDef {
	
	private WebDriver driver;
	private PaymentPageBean pageBean;

	@Before
	public void setupScenarioEnv() {
		driver = DriverFactory.getDriver();
		pageBean = PageFactory.initElements(driver, PaymentPageBean.class);
	}
	
	@Given("User is on Payment Details Page")
	public void user_is_on_Payment_Details_Page() {
	    driver.get("file:///E:/DAQE%20Training/BBD/Projects/ConferenceBooking/PaymentDetails.html");
	}

	@When("User Verify the title Personal Details of the page")
	public void user_Verify_the_title_Personal_Details_of_the_page() throws InterruptedException {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Payment Details";
		assertEquals(actualTitle, expectedTitle);
	}

	@When("User ensuring that alert box displays message Please fill the Card holder name")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_Card_holder_name() throws InterruptedException {
		pageBean.getAlertBox();
		String actualAlertMsg = driver.switchTo().alert().getText();
		String expectedAlertMsg = "Please fill the First Name";
		assertEquals(actualAlertMsg, expectedAlertMsg);
		driver.switchTo().alert().accept();
	}

	@When("User Enter Card Holder Name")
	public void user_Enter_Card_Holder_Name() {
		driver.findElement(By.id("txtFirstName")).sendKeys("aaa");
		driver.findElement(By.id("txtLastName")).sendKeys("bbb");
	}

	@When("User ensuring that alert box displays message Please fill the Debit card Number")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_Debit_card_Number() {
		pageBean.getAlertBox();
		String actualAlertMsg = driver.switchTo().alert().getText();
		String expectedAlertMsg = "Please fill the Debit card Number";
		assertEquals(actualAlertMsg, expectedAlertMsg);
		driver.switchTo().alert().accept();
	    
	}

	@When("User Enter Debit card Number")
	public void user_Enter_Debit_card_Number() {
		driver.findElement(By.id("txtDebit")).sendKeys("111");
		driver.findElement(By.id("txtCvv")).sendKeys("222");
	}

	@When("User ensuring that alert box displays message Please fill expiration month")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_expiration_month() {
		pageBean.getAlertBox();
		String actualAlertMsg = driver.switchTo().alert().getText();
		String expectedAlertMsg = "Please fill expiration month";
		assertEquals(actualAlertMsg, expectedAlertMsg);
		driver.switchTo().alert().accept();
	}

	@When("User Enter Card expiration month")
	public void user_Enter_Card_expiration_month() {
		driver.findElement(By.id("txtMonth")).sendKeys("11");
	    
	}

	@When("User ensuring that alert box displays message Please fill expiration year")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_expiration_year() {
		pageBean.getAlertBox();
		String actualAlertMsg = driver.switchTo().alert().getText();
		String expectedAlertMsg = "Please fill the expiration year";
		assertEquals(actualAlertMsg, expectedAlertMsg);
		driver.switchTo().alert().accept();
	   
	}

	@When("User Enter Card expiration year")
	public void user_Enter_Card_expiration_year() {
		driver.findElement(By.id("txtYear")).sendKeys("2024");
	}

	@When("User Click on the Make Payment button")
	public void user_Click_on_the_Make_Payment_button() {
		pageBean.getAlertBox();   
	}

	@Then("User ensuring that alert box displays message Conference Room Booking successfully done!!!")
	public void user_ensuring_that_alert_box_displays_message_Conference_Room_Booking_successfully_done() {
		String actualAlertMsg = driver.switchTo().alert().getText();
		String expectedAlertMsg = "Registarion successful!!!";
		assertEquals(actualAlertMsg, expectedAlertMsg);
		driver.switchTo().alert().accept();
	}
	
	@After
	public void tearDownScenarioEnv(Scenario scenario) {
		
		if(scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			byte [] screenShotData = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenShotData, "image/png" ,"");
		}
		driver.quit();
		driver=null;
	}
}
