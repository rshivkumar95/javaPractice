package com.atos.assignments.assign3_2;

public class CodeGeneration {

	public StringBuilder generateCode(StringBuilder str)
	{
		str=str.reverse();
		//System.out.println(str);
		str=str.deleteCharAt(0);
		//System.out.println(str);
		str=str.replace(0, 2, "*");
		//System.out.println(str);
		str=str.deleteCharAt(str.length()-1);
		//System.out.println(str);
		str=str.append('#');
		
		//System.out.println(str);
		return str;
		
	}
}
