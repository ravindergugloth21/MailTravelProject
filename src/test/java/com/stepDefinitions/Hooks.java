package com.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	
	public static String BASE_URL = "https://www.mailtravel.co.uk/";
	
	public static By COOKIE = By.cssSelector("button[title='Accept Cookies']");
	
	@Before
	public void start() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(BASE_URL);
		Thread.sleep(3000);
		driver.findElement(COOKIE).click();
		
	}
		
	
	@After
	public void close()
	{
		driver.close();
	}
	

}
