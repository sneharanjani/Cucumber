package com.cucumber.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public void openBrowser(String browser)
	{
	if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	}
	public void navigate(String url)
	{
		driver.get(url);
	}
	
}
