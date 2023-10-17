package com.techpalle;

public class Pangram 
{

	public static void main(String[] args)
	{
		 String input = "The quick brown fox jumps over the lazy dog"; 

		 boolean isPangram = isPangram(input);
		 if (isPangram)
		 {
			 System.out.println("The input is a pangram.");
		 } 
		 else 
		 {
		     System.out.println("The input is not a pangram.");
		       
		 }
	}

    public static boolean isPangram(String input) 
    {
		
    	input = input.toUpperCase();
        
	    boolean[] alphabetPresent = new boolean[26];

		for (int i = 0; i < input.length(); i++) 
		{
		    char c = input.charAt(i);
		    if (c >= 'A' && c <= 'Z') 
		    {
		        alphabetPresent[c - 'A'] = true;
		    }
		}
           // Check if all alphabet letters are present
		for (boolean present : alphabetPresent)
		{
		    if (!present) 
		    {
		        return false; // If any letter is missing, it's not a pangram
		    }
		}

	    return true; // All letters are present, so it's a pangram
    }
}
		


