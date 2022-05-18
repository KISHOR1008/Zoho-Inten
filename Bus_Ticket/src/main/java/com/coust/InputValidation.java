package com.coust;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation 
{
//	public static void main(String[] args)
//	{
//		check("kishor.ee19@bitsathy.ac.in","9626072677");
//	}
static boolean check( String emailid , String number )
{
	 String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";  
     Pattern pattern = Pattern.compile(regex);  
     Matcher matcher = pattern.matcher(emailid);  
     if(!matcher.matches())
     {
    	 System.out.println("Enter the valid emailid");
    	return true; 
     }
    if( !number.matches("\\d{10}"))
    {
    	 System.out.println("Enter the valid phone number");
    	return true;
    }
	System.out.println("All are crtuuu");
	return false;
	
}
}
