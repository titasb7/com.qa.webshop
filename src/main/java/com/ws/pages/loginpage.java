package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.Drivermanager;

public class loginpage extends Drivermanager {

	/*
	 * 1st step to locating the page elements by using @findby
	 */
	// *********page elements******************
	@FindBy(id = "Email")
	WebElement emeilfieldtext;
	@FindBy(id = "Password")
	WebElement Passwordfieldtext;
	@FindBy(linkText = "Forgot password?")
	WebElement Forgotpasswordlink;
	@FindBy(xpath = "//label[@for='RememberMe']")
	WebElement remembermeButton;
	@FindBy(xpath = "//input[@class ='button-1 login-button']")
	WebElement loginButton;

	// ****page initialized by using constructor*****************
/*
 * Title :login page 
 * login page contains mathods and actions 
 * Developed by : Titas Bhaatacharjee, Date : 02/22/2024
 * verified by :verified by ..., email :
 */
	public loginpage() {

		PageFactory.initElements(driver, this);
	}

//****************page Action or methods  on the elements **************

	public String getloginpageTitle() {
		return driver.getTitle();

	}

	public void enterEmail(String email) {
		emeilfieldtext.click();
		emeilfieldtext.clear();
		emeilfieldtext.sendKeys(email);

	}

	public void enterPassowrd(String password) {
		Passwordfieldtext.click();
		Passwordfieldtext.clear();
		Passwordfieldtext.sendKeys(password);
	}

	public boolean isForgotpasswordlinkPresent() {
		return Forgotpasswordlink.isDisplayed();
	}

	public void clickremembermeButton() {

		remembermeButton.click();
	}

	public void clickloginButton() {

		loginButton.click();
	}

}
