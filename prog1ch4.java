package com.darwinsys.regex;

import java.util.Scanner;

public class prog1ch4
{

	public static void main(String[] args) 
	{
 
	     Scanner sc = new Scanner (System.in);
	     String s ;
	     System.out.println("enter the string : \n");
	     s = sc.nextLine();
	     String s1 = s.replaceAll("\\s", "");
	     System.out.println(s1);
	}

}
