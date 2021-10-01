package com.data.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.data.utility.TestExecutor;

public class Registration extends TestExecutor{
	
	@Test
	public void register() throws IOException
	{
		reg.EnterFirstNameLastName(getData("FirstName"), getData("LastName"));
		
		reg.EnterAddres(getData("Address"));
		
		reg.EnterPhoneNumber(getData("Phonenumber"));
		reg.EnterEmailAddress(getData("EmailAddress"));
		reg.validatePhoneNumber(getData("Phonenumber"));
		
	}
	
	
	

}
