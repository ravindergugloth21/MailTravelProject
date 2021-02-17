package com.stepDefinitions;

import java.util.Map;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDef extends BaseClass {
	@When("^I click on Sign Up to our NewsLetter$")
	public void i_click_on_Sign_Up_to_our_NewsLetter() throws Throwable {
		signUpPage.singUpLink();
	}
	   
	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials(DataTable credentialinformation) throws Throwable {
		
	Map<String,String>signupdetails=credentialinformation.asMap(String.class,String.class);
    	signUpPage.signupCredentials(signupdetails);
		
	}
	 

	@When("^I click Terms and conditions checkbox$")
	public void i_click_Terms_and_conditions_checkbox() throws Throwable {
		
	signUpPage.termsAndConditions();
	   
	}

	@When("^click signup button$")
	public void click_signup_button() throws Throwable {
		signUpPage.signup();
	}
	   
	

	@Then("^I should see signed up for confirmation$")
	public void i_should_see_signed_up_for_confirmation() throws Throwable {
		signUpPage.signUpVerification();
	}
	    



}
