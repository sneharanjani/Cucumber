package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMpage {

	public static WebDriver driver;
	
	public FreeCRMpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="lid")
	public WebElement Username;
	public void enterusername(String username){
		Username.sendKeys("sneha");
	}
	
	@FindBy(id="pwd")
	public WebElement Password;
	public void enterpassword(String password){
		Password.sendKeys("sne123");
	}
	
	@FindBy(id="signin_submit")
	public WebElement Signin1;
    public void clickonsignin(){
    	Signin1.click();
    }
	
}
