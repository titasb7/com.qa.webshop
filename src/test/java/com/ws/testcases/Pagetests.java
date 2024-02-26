package com.ws.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pagetests  extends BaseTest {
	@Test(enabled = false)
	public void testHomePageTitle() {
		
		
	String 	title =homepage.getHomePageTitle();
	Assert.assertTrue(title.contains("Demo Web Shop"));
		
	System.out.println(title);
	
	driver.quit();
	}
	
	@Test(enabled = false)
	public void Testloginfunction() throws InterruptedException {
		
		homepage.clickLogin();
		
		
	String loginpageTitle = Login.getloginpageTitle();
		Assert.assertTrue(loginpageTitle.contains("Login"));
		Login.enterEmail("selauto1@test.com");
		Login.enterPassowrd("Pass@123");
	
		Login.clickloginButton();
		String 	title =homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web Shop"));
		homepage.clicklogoutlink();

			
		}
	@Test
	public void testisForgotpasswordlinkPresent() {
		
		homepage.clickLogin();
		
	String loginpageTitle = Login.getloginpageTitle();
		Assert.assertTrue(loginpageTitle.contains("Login"));
		Login.enterEmail("selauto1@test.com");
		Login.enterPassowrd("Pass@123");
		boolean flag = Login.isForgotpasswordlinkPresent();
		Assert.assertTrue(flag);
		Login.clickloginButton();
		String 	title =homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web Shop"));
		homepage.clicklogoutlink();
		
	}
	@Test
	public void trstclickremembermeButton() {
		homepage.clickLogin();
		
		String loginpageTitle = Login.getloginpageTitle();
			Assert.assertTrue(loginpageTitle.contains("Login"));
			Login.enterEmail("selauto1@test.com");
			Login.enterPassowrd("Pass@123");
			boolean flag = Login.isForgotpasswordlinkPresent();
			Assert.assertTrue(flag);
			Login.clickremembermeButton();
			Login.clickloginButton();
			String 	title =homepage.getHomePageTitle();
			Assert.assertTrue(title.contains("Demo Web Shop"));
			homepage.clicklogoutlink();
		
	}

}



