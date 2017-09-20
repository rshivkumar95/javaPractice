package com.atos.assignments.assign3;

public class SpaceRemover {

	public String removeSpaces(String str)
	{
			
		return str.trim().replaceAll(" +"," " );
	}
}
