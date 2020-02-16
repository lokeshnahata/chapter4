package com.darwinsys.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prog5 {
	public static void main(String[] args)
{
		String pattern = "\\D+";
		Scanner sc = new Scanner (System.in);
		String s ;
		System.out.println("enter the string");
		s = sc.nextLine();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
}
		
}
