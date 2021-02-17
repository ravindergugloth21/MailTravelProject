package com.pages;

import com.runner.BaseClass;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class SignUpPage extends BaseClass{
	
	public static By SIGNUPNEWSLETTERLINK=By.cssSelector("span[id='reassurance-bar-iter_4_top-bar-text']");
	public static By TITLE=By.cssSelector("select[name='vars[title]']");
	public static By FIRSTNAME=By.cssSelector("input[placeholder='First Name']");
	public static By LASTNAME=By.cssSelector("input[placeholder='Last Name']");
	public static By EMAILADDRESS=By.cssSelector("input[placeholder='E-mail Address']");
	public static By POSTCODE=By.cssSelector("input[placeholder='Postcode']");
	public static By PHONE=By.cssSelector("input[placeholder='Postcode']");
	public static By AGREEBUTTON=By.cssSelector("input[id='agree']");
	public static By SIGNUPBUTTON=By.cssSelector("input[id='sign-up']");
		
	
	public void singUpLink()
	{
		waits1.waitForMilliSeconds(5000);
		action1.clickOnElement(SIGNUPNEWSLETTERLINK);
	}
	public void signupCredentials(Map<String,String>credentialinformation)
	{
		waits1.waitForMilliSeconds(5000);
    	Select title1DropDown = new Select(driver.findElement(TITLE));
        title1DropDown.selectByVisibleText(credentialinformation.get("Title"));
		action1.sendText(FIRSTNAME,credentialinformation.get("FirstName") );
		action1.sendText(LASTNAME,credentialinformation.get("LastName") );
		action1.sendText(EMAILADDRESS,credentialinformation.get("EmailAddress") );
		action1.sendText(POSTCODE,credentialinformation.get("PostCode") );
		action1.sendText(PHONE,credentialinformation.get("Phone") );
		
	}
	public void termsAndConditions()
	{
		action1.clickOnElement(AGREEBUTTON);	
	}
	public void signup()
	{
		action1.clickOnElement(SIGNUPBUTTON);	
	}
	public void signUpVerification()
	{
		String thanks=driver.findElement(By.cssSelector("div[class='panel-body'] h2")).getText();
		Assert.assertEquals("Thanks for signing up!", thanks);
	}

}
