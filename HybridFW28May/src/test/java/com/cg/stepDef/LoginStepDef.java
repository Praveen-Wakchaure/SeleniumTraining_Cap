package com.cg.stepDef;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;

import com.cg.pages.LoginPage;
import com.cg.util.TestUtil;

import cucumber.api.java.en.*;


public class LoginStepDef {
	LoginPage login;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	  login=new LoginPage();
	}

	@When("^user enters \"([^\"]*)\" & \"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2) throws Throwable {
	    login.enterUserName(arg1);
	    login.enterPassword(arg2);
	}

	@When("^user clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
	   login.clickBtn();
	}

	@Then("^user is on same page$")
	public void user_is_on_same_page() throws Throwable {
		TestUtil.takeScreenShot();
	    Assert.assertTrue(login.getTitle().contains("Online Shopping India"));
	}



}
