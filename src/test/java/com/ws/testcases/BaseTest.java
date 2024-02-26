package com.ws.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ws.base.Drivermanager;
import com.ws.pages.Homepage;
import com.ws.pages.loginpage;

public class BaseTest extends Drivermanager {

	Homepage homepage;
	loginpage Login;
	
	@BeforeMethod
	public void setup() {
		
		InitApplication();
		 homepage =new Homepage();
		 Login=new loginpage();
	}
	
	@AfterMethod
	public void teardown() {
	driver.quit();	
	
	}
	
	
}
