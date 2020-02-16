package com.darwinsys.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prog4 
{

	public static void main(String[] args)
{
		int m1,max=0;
		String pattern = "\\d+";
		Scanner sc = new Scanner (System.in);
		String s ;
		System.out.println("enter the string");
		s = sc.nextLine();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			m1 = Integer.parseInt(m.group());
			
			if(m1>max)
			  max =m1;
		}
		System.out.println("maximum = "+max);
	}

}
