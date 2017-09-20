package com.atos.assignments.assign7;

import java.util.regex.Pattern;

public class Verifier {
	
	public static boolean verifyPassword(String password)
	{
		if(Character.isAlphabetic(password.charAt(0)))
		{
			if(password.length()>6)
			{
				if(password.contains("@") || password.contains("#") || password.contains("!"))
				{
					if(password.matches(".*\\d.*"))
					{
						return true;
					}
				}
			}
			
		}
		
		
		return false;
		
	}

}
