package com.ws.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Drivermanager {

	/*This is public webdriver driver as a globalvariable with static means we are not creating any object but it is a class level variab;le access the data for the whole project
	 *  properties prop is also use as global variable to access the properties class method
	 */
	

	public static WebDriver driver;
	Properties prop;
	
	/*
	 * This constructor is responsible for loading properties file from the
	 * config.property
	 */

	public Drivermanager() {

		try {
			File file = new File("./src/test/resources/config/cofig.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("Unable to load the propertis ");
			e.printStackTrace();
		}

	}

	
	public void InitApplication() {

		String browser = prop.getProperty("browser");
		
		if(browser.trim().equalsIgnoreCase("chrome"))
		{System.out.println("driver in use :"+browser);

		driver= new ChromeDriver();
		}

		else if(browser.trim().equalsIgnoreCase("edge"))
			
		{System.out.println("driver in use :"+browser);
		driver= new EdgeDriver();
		}
	
else if(browser.trim().equalsIgnoreCase("firefox"))
			
		{System.out.println("driver in use :"+browser);
		driver= new FirefoxDriver();
		
		}
else 
{
	System.out.println("un supported browser");
		
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		geturl();
		
	}
	
	/*
	 * this method is to get the application url
	 */
	
	public  void geturl() {
		String url =prop.getProperty("url");
		driver.get(url);
	}
	/*
	 * This method to quit the url
	 */
	 
		public static void driverquit() {
		driver.quit();
		}
		
	}
	
	


