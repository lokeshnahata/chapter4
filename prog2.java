//note output not showing dont know why...if you know please tell me also!!!
package com.darwinsys.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "\\b((0)?(91)?)([7-9][0-9]{9})\\b";
		Scanner sc = new Scanner (System.in);
		String s ;
		System.out.println("enter the mobile number ");
		s = sc.nextLine();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}
