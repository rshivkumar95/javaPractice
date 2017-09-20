package com.atos.day2.assignments;
import java.util.Scanner;

public class Kaprekar {
	 public static void main(String args[])
	    {
	        Scanner ob=new Scanner(System.in);
	        System.out.println("Enter number");
	        int n=ob.nextInt();
	        int N=n*n;
	        int tn=n;int c=0;
	        while(tn!=0)
	        {
	            tn=tn/10;c++;
	        }
	        int q=(int)(N/Math.pow(10,c));
	        int r=(int)(N%Math.pow(10,c));
	        if(q+r==n)
	            System.out.println("Kaprekar number");
	        else
	            System.out.println("Non Kaprekar number");
	  }
	
}

/* 
 Enter number
9
Kaprekar number

Enter number
101
Non Kaprekar number

*/
