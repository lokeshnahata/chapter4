package com.darwinsys.regex;

import java.util.regex.Pattern;

public class CannonEqDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattStr ="\u00e1pple";
	     String input []= {"\u00e1pple","a\u0301pple","a\u02capple","a'pple","a\u00b4pple",};
	     
	     Pattern pattern = Pattern.compile(pattStr,Pattern.CANON_EQ);
	     for(int i =0;i<input.length;i++)
	     {
	    	 if(pattern.matcher(input[i]).matches())
	    	 {
	    		 System.out.println(pattStr +" matches input "+input[i]);
	    		 
	    	 }
	    	 else
	    	 {
	    		 System.out.println(pattStr +" does not matches input "+input[i]);
	    	 }
	     }
	}

}
