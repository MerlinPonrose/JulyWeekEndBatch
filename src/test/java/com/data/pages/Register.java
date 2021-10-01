package com.data.pages;

import com.data.utility.TestExecutor;

public class Register extends TestExecutor{
	
	
	public String FirstName = "//input[@placeholder='First Name']";
	public String LastName = "//input[@placeholder='Last Name']";
	public String Address = "//textarea[@ng-model='Adress']";
	public String Phone = "//input[@ng-model='Phone']";
	public String email = "//input[@ng-model='EmailAdress']";
	
	public void EnterFirstNameLastName(String firstName, String lastName)
	{
		com.enterValue(reg.FirstName, firstName);
		com.enterValue(reg.LastName, lastName);
	}
	
	public void EnterAddres(String address_value)
	{
		com.enterValue(reg.Address, address_value);
	}
	
	public void EnterPhoneNumber(String phoneNumber)
	{
		com.enterValue(reg.Phone, phoneNumber);
	}
	
	public void EnterEmailAddress(String emailAddress)
	{
		com.enterValue(reg.email, emailAddress);
	}
	
	public void validatePhoneNumber(String phoneNumber)
	{
		int length = phoneNumber.length();
		if(length==10)
		{
			System.out.println("valid Number");
		}
		else
		{
			System.out.println("In valid Number");
		}
	}

}
