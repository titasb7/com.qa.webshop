package com.ws.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ws.base.Drivermanager;
import com.ws.pages.Homepage;
import com.ws.pages.loginpage;

public class Pagetests  extends Drivermanager {
	@Test(enabled = false)
	public void testHomePageTitle() {
		
		InitApplication();
		Homepage homepage =new Homepage();
		
	String 	title =homepage.getHomePageTitle();
	Assert.assertTrue(title.contains("Demo Web Shop"));
		
	System.out.println(title);
	
	driver.quit();
	}
	
	@Test
	public void Testloginfunction() throws InterruptedException {
		InitApplication();
		Homepage homepage =new Homepage();
		homepage.clickLogin();
		
		loginpage Login=new loginpage();
	String loginpageTitle = Login.getloginpageTitle();
		Assert.assertTrue(loginpageTitle.contains("Login"));
		Login.enterEmail("selauto1@test.com");
		Login.enterPassowrd("Pass@123");
		boolean Forgotpasswordlink = Login.isForgotpasswordlinkPresent();
	Assert.assertTrue(Forgotpasswordlink);
	Thread.sleep(10);
		Login.clickremembermeButton();
		Login.clickloginButton();
		String 	title =homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web Shop"));
		homepage.clicklogoutlink();
		driver.quit();
		
		
			
		}
		


}



