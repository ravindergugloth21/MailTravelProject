package com.runner;

import org.openqa.selenium.WebDriver;

import com.driver.Action;
import com.driver.Get;
import com.driver.Waits;
import com.pages.HomePage;
import com.pages.ResultsVerifyPage;
import com.pages.SignUpPage;
import com.pages.TravelDescriptionPage;

public class BaseClass {
	
	public static WebDriver driver;
	public static HomePage homePage = new HomePage();
	public static Action action1 = new Action();
	public static Get get1 = new Get();
	public static Waits waits1 = new Waits(); 
	public static TravelDescriptionPage travelPage1 = new TravelDescriptionPage();
	public static ResultsVerifyPage resultsPage1 = new ResultsVerifyPage();
	public static SignUpPage signUpPage=new SignUpPage();

}
