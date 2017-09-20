

package com.atos.assignments.assign2;

public class Capitalizer {

      public String Capitalize(String Input)	{
    	  String[] arr= Input.split(" ");
  		Input = "";

  		for(int i = 0; i < arr.length; i++){
  		    char capLetter = Character.toUpperCase(arr[i].charAt(0));
  		    Input +=  " " + capLetter + arr[i].substring(1);
  		}
  		return Input = Input.trim();
		
    	  
      }
	
	
}
