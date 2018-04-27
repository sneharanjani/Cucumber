package com.stepdefinations;

import com.base.Testbase;
import com.pages.FreeCRMpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinations extends Testbase {
        
	Testbase cucumber = new Testbase();
	
	@Given("^I open \"([^\"]*)\" browser$")
	public void i_open_browser(String browser) throws Throwable {
	   cucumber.openbrowser(browser);    
	}

	@When("^I navigate to the \"([^\"]*)\" url$")
	public void i_navigate_to_the_url(String url) throws Throwable{ 
	   cucumber.enterurl(url);
	   }

	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String username, String password) throws Throwable {
		FreeCRMpage fp = new FreeCRMpage(driver);
		fp.enterusername(username);
		fp.enterpassword(password);
	   }

	@Then("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws Throwable {
		FreeCRMpage fp = new FreeCRMpage(driver);
		fp.clickonsignin();
	}


	
}
