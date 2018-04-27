package com.cucumber.stepdefinitions;



import com.cucumber.base.TestBase;
import com.cucumber.pages.facebookpage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdefinitions extends TestBase {
	TestBase cucumber=new TestBase();
	@Given("^I open \"([^\"]*)\" browser$")
	public void i_open_browser(String browser) throws Throwable {
	    cucumber.openBrowser(browser);
	}

	@When("^I naviagte to \"([^\"]*)\" url$")
	public void i_naviagte_to_url(String url) throws Throwable {
	   cucumber.navigate(url);
	}

	@When("^I enter \"([^\"]*)\" into the email field$")
	public void i_enter_into_the_email_field(String email) throws Throwable {
	  
	   facebookpage fp=new facebookpage(driver);
	   fp.enterMail(email);
	   
	}
}
