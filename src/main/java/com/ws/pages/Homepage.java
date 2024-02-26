package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.Drivermanager;

public class Homepage extends Drivermanager {

	/*
	 * 1st step to locating the page elements by using @findby
	 */
	// *********page elements******************
	
/*
 * Title :Home page 
 * login page contans mathods and actions 
 * Developed by : Titas Bhaatacharjee, Date : 02/22/2024
 * verified by ..., email :
 */
	@FindBy(linkText = "Log in")WebElement loginlink;
	@FindBy(linkText = "Log out")WebElement logoutlink;

	// ****page initialized by using constructor*****************

	public Homepage() {

		PageFactory.initElements(driver, this);
	}

//****************page Action or methods  on the elements **************

	public String getHomePageTitle() {
		return driver.getTitle();

	}

	public void clickLogin() {
		loginlink.click();
	}
public void clicklogoutlink() {
	logoutlink.click();
}
}

