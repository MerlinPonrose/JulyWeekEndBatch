package com.data.utility;

import org.openqa.selenium.By;

public class Common extends TestExecutor{
	
	
	public void clickElementByXpath(String xpath)
	{
		try
		{
			driver.findElement(By.xpath(xpath)).click();
		}
		catch(Exception e)
		{
			System.out.println("Error occured"+xpath);
		}
	}
	
	public void click(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public void enterValue(String xpath,String value)
	{
		try
		{
			driver.findElement(By.xpath(xpath)).click();
			driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).sendKeys(value);
		}
		
		catch(Exception e)
		{
			System.out.println("Error occured"+xpath);
		}
	}

	
	public void verifyPageTitle(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("User is in Registration page");
		}
		
		else
		{
			System.out.println("Usrr is not in Registration page");
		}
	}
}
