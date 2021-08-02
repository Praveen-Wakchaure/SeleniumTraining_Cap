package com.cg.project.stepdefs;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.project.factory.DriverFactory;
import com.cg.project.pagebeans.RegistrationPageBean;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDef {
	
	private WebDriver driver;
	private RegistrationPageBean pageBean;
	
	@Before
	public void setupScenarioEnv() {
		driver = DriverFactory.getDriver();
		pageBean = PageFactory.initElements(driver, RegistrationPageBean.class);
	}

	@Given("User is on Conference Registration Page")
	public void user_is_on_Conference_Registration_Page() {
	    driver.get("file:///E:/DAQE%20Training/BBD/Projects/ConferenceBooking/ConferenceRegistartion.html");
	}

	@When("User Verify the title Conference Registration of the page.")
	public void user_Verify_the_title_Conference_Registration_of_the_page() {
	    String actualTitle= driver.getTitle();
	    //System.out.println(actualTitle);
	    String expectedTitle= "Conference Registartion";
	    assertEquals(actualTitle, expectedTitle);
	}

	@And("User ensuring that alert box displays message Please fill the First Name")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_First_Name() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please fill the First Name";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User Enters First name")
	public void user_Enters_First_name() throws InterruptedException {
		pageBean.setFirstName("First Name");
		//pageBean.getFirstName();
	}

	@And("User ensuring that alert box displays message Please fill the Last Name")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_Last_Name() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please fill the Last Name";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User enters Last name")
	public void user_enters_Last_name() throws InterruptedException {
	    pageBean.setLastName("Last Name");
	    //pageBean.getLastName();  
	}
	
	@And("User ensuring that alert box displays message Please fill the Email")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_Email() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please fill the Email";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}
	
	@And("User Enters Invalid Email")
	public void user_Enters_Invalid_Email() throws InterruptedException {
	    pageBean.setEmail("aaa");
	    pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please enter valid Email Id.";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	    driver.findElement(By.id("txtEmail")).clear();
	}

	@And("User Enter Valid Email")
	public void user_Enter_Valid_Email() throws InterruptedException {
		pageBean.setEmail("aaa@gmail.com");
	}

	@And("User ensuring that alert box displays message Please fill the Contact No")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_Contact_No() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please fill the Contact No.";
	    assertEquals(expectedErrorMsg, actualErrorMsg); 
	}
	
	@And("User Enter Invalid Contact no")
	public void user_Enter_Invalid_Contact_no() throws InterruptedException {
		pageBean.setContactNo("52251616");
		pageBean.getErrorMsg();
	}
	
	@And("User ensuring that alert box displays message Please enter valid Contact no")
	public void user_ensuring_that_alert_box_displays_message_Please_enter_valid_Contact_no() throws InterruptedException {
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Enter 10-digit Contact no.";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	    driver.findElement(By.id("txtPhone")).clear();
	}

	@And("User Enter Valid contact number")
	public void user_Enter_Valid_contact_number() throws InterruptedException {
	    pageBean.setContactNo("8598762548");
	    //Thread.sleep(2000);
	}

	@And("User ensuring that alert box displays message Number of people attending")
	public void user_ensuring_that_alert_box_displays_message_Number_of_people_attending() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please fill the Number of people attending";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User Select Number of people attending")
	public void user_Select_Number_of_people_attending() throws InterruptedException {
		Select objSelect = new Select(driver.findElement(By.name("size")));
		objSelect.selectByValue("one");
		//Thread.sleep(2000);
	}

	@And("User ensuring that alert box displays message Please fill the Building & Room No")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_Building_Room_No() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please fill the Building & Room No";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User Enters Building & Room No")
	public void user_Enters_Building_Room_No() {
	   driver.findElement(By.id("txtAddress1")).sendKeys("aaa");
	}

	@And("User ensuring that alert box displays message Please fill the Area name")
	public void user_ensuring_that_alert_box_displays_message_Please_fill_the_Area_name() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please fill the Area name";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User Enter Area name")
	public void user_Enter_Area_name() {
		driver.findElement(By.id("txtAddress2")).sendKeys("bbb");
	}

	@And("User ensuring that alert box displays message Please select city")
	public void user_ensuring_that_alert_box_displays_message_Please_select_city() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please select city";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User Select City")
	public void user_Select_City() throws InterruptedException {
		Select objSelect = new Select(driver.findElement(By.name("city")));
		objSelect.selectByValue("Pune");
		//Thread.sleep(2000);
	}

	@And("User ensuring that alert box displays message Please select state")
	public void user_ensuring_that_alert_box_displays_message_Please_select_state() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please select state";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User Select State")
	public void user_Select_State() throws InterruptedException {
		Select objSelect = new Select(driver.findElement(By.name("state")));
		objSelect.selectByValue("Maharashtra");
		//Thread.sleep(2000); 
	}

	@And("User ensuring that alert box displays message Please Select MemeberShip status")
	public void user_ensuring_that_alert_box_displays_message_Please_Select_MemeberShip_status() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	    String expectedErrorMsg = "Please Select MemeberShip status";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@And("User Select only one type of Conference from two options")
	public void user_Select_only_one_type_of_Conference_from_two_options() throws InterruptedException {
		driver.findElement(By.name("memberStatus")).click();
		//Thread.sleep(2000);
	}

	@When("User Click on the link Next And ensuring that alert box displays message Personal details are validated")
	public void user_Click_on_the_link_Next_And_ensuring_that_alert_box_displays_message_Personal_details_are_validated() throws InterruptedException {
		pageBean.getErrorMsg();
		String actualErrorMsg = driver.switchTo().alert().getText();
	    String expectedErrorMsg = "Personal details are validated.";
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	    driver.switchTo().alert().accept();
	}

	@Then("User Verify that it navigate to PaymentDetails.html page")
	public void user_Verify_that_it_navigate_to_PaymentDetails_html_page() {
	   String actualURL = driver.getCurrentUrl();
	   String expectedURL = "file:///E:/DAQE%20Training/BBD/Projects/ConferenceBooking/PaymentDetails.html";
	   assertEquals(actualURL, expectedURL);
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
