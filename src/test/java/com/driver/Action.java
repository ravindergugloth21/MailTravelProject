package com.driver;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class Action extends BaseClass {
	public void clickOnElement(By element)
	{
		driver.findElement(element).click();
	}
	
	public void sendText(By element,String text)
	{
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(text);
	}
	
	
	
	
	
	

}


