package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {

	public static WebDriver driver;
	
	public void openbrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
		
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} 
	}
	 public void enterurl(String url){
		
		   driver.get(url);
	}
}
