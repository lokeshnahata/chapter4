package com.darwinsys.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Java program to demonstrate difference between Possessive and  
//Greedy Quantifiers 
public class prog7 
{

	public static void main(String[] args) 
	{
		// Create a pattern with Greedy quantifier 
		Pattern pg = Pattern.compile("g+g");
		
		// Create a pattern with possessive quantifier
		Pattern pp = Pattern.compile("ggg");
		
		// Create a pattern with reluctant quantifier
		Pattern pr = Pattern.compile("g+?");
		
		System.out.println("Using Greedy Quantifier...."); 
        Matcher mg = pg.matcher("ggg");  
        while (mg.find()) 
            System.out.println("Pattern found from " + mg.start() + 
                               " to " + (mg.end()-1));  
  
        System.out.println("\nUsing Possessive Quantifier...."); 
        Matcher mp = pp.matcher("ggg");  
        while (mp.find()) 
            System.out.println("Pattern found from " + mp.start() + 
                               " to " + (mp.end()-1));  
       
        System.out.println("\nUsing Reluctant Quantifier...."); 
        Matcher mr = pr.matcher("ggg");  
        while (mr.find()) 
            System.out.println("Pattern found from " + mr.start() + 
                               " to " + (mr.end()-1)); 
        
	}

}
