package com.darwinsys.regex;

import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class prog3ch4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String email,url;
		System.out.println("Enter the email to be validated");
		email = sc.next();
		if(isValid_email(email))
			System.out.println("VALID EMAIL");
		else
			System.out.println("INVALID EMAIL");
	    
		System.out.println("enter the url to be validated");
		url = sc.next();
		if(isValid_url(url))
			System.out.println("VALID URL");
		else
			System.out.println("INVALID URL");
	    
     
	}
	public static boolean isValid_email(String email)
	{
		String pattern ="\\p{Alnum}+(@)+\\p{Alnum}+(.)\\p{Alpha}+";
		
		Pattern p = Pattern.compile(pattern);
		if(email==null)
			return false;
		return p.matcher(email).matches();
	}
	public static boolean isValid_url(String url)
	{
		try
		{
			new URL(url).toURI();
			return true;
		}
		// If there was an Exception 
        // while creating URL object 
		catch (Exception e)
		{
			return false;
		}
	}

}
