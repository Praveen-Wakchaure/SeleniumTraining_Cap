package com.cg.project.pagebeans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class RegistrationPageBean {

	@FindBy(how = How.ID, id = "txtFirstName")
	private WebElement firstName;
	
	@FindBy(how = How.ID, id = "txtLastName")
	private WebElement lastName;
	
	@FindBy(how= How.PARTIAL_LINK_TEXT, partialLinkText = "Next")
	private WebElement next;
	
	@FindBy(how = How.XPATH, partialLinkText = "Next" )
	private WebElement errorMsg;
	
	@FindBy(how = How.ID, id = "txtEmail")
	private WebElement email;
	
	@FindBy(how = How.ID, id="txtPhone")
	private WebElement contactNo;


	public String getFirstName() {
		return firstName.getText();
	}

	public void setFirstName(String firstName) throws InterruptedException {
		this.firstName.sendKeys(firstName);
		//Thread.sleep(2000);
	}

	public String getLastName() {
		return lastName.getText();
	}

	public void setLastName(String lastName) throws InterruptedException {
		this.lastName.sendKeys(lastName);
		//Thread.sleep(2000);
	}

	public void getNext() {
		next.submit();;
	}

	public void getErrorMsg() throws InterruptedException {
		errorMsg.click();
		//Thread.sleep(2000);
	}
	
	public void setEmail(String email) throws InterruptedException {
		this.email.sendKeys(email);
		//Thread.sleep(2000);
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) throws InterruptedException {
		this.contactNo.sendKeys(contactNo);
		//Thread.sleep(2000);
	}


//	public String getUsername() {
//		return firstName.getText();
//	}
//
//	public void setUsername(String username) {
//		this.username.sendKeys(username);
//	}
//
//	public String getPassword() {
//		return password.getText();
//	}
//
//	public void setPassword(String password) {
//		this.password.sendKeys(password);
//	}
//
//	public String getErrorMsg() {
//		return errorMsg.getText();
//	}
//	
//	public void signIn() {
//		submit.submit();
//	}


	
}