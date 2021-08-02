package com.cg.project.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cg.project.factory.DriverFactory;
import com.cg.project.pagebeans.LoginPageBean;
import com.cg.project.utils.DataUtils;

public class LoginTest {
	private WebDriver driver;
	private LoginPageBean pageBean;

	@Parameters(value = { "browserName" })
	@BeforeMethod
	public void setUpTestEnv(String browserName) {
		driver = DriverFactory.getDriver(browserName);
		driver.get("https://github.com/login");
		pageBean = PageFactory.initElements(driver, LoginPageBean.class);
	}

	@Test(dataProvider = "loginMockData")
	public void testLoginForInvalidcCredential(String username, String password) {
		pageBean.setUsername(username);
		pageBean.setPassword(password);
		pageBean.signIn();
		String expectedError = "Incorrect username or password.";
		String actualError = pageBean.getErrorMsg();
		Assert.assertEquals(actualError, expectedError);
	}

	@Test
	public void testLoginForValidcCredential() {
		Assert.fail();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		driver = null;
	}

	@DataProvider
	public Object[][] loginMockData() {
		return DataUtils.getLoginMockData();

	}

}