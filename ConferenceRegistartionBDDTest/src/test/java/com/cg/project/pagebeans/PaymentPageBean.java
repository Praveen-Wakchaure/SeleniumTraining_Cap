package com.cg.project.pagebeans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPageBean {

	@FindBy(how = How.XPATH, xpath = "//input[@value='Register']")
	private WebElement alertBox;

	public void getAlertBox() {
		alertBox.click();
	}

}
