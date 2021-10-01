package com.data.pages;

import org.openqa.selenium.By;

import com.data.utility.TestExecutor;

public class SignUpTest extends TestExecutor{

	public String email = "//input[@placeholder='E mail']";
	public String password = "//input[@placeholder='Password']";
	
	
	public void clickAndEnterEmail(String emailAddress)
	{
		com.enterValue(email, emailAddress);
	}
	
	public void clickAndEnterPassword(String pass)
	{
		com.enterValue(password, pass);
	
	}
	
	
	
}
