package com.atos.java.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String ::");
		String str=sc.nextLine();
		System.out.println("The Words in the sring are :");
//		String str1[]=str.split(":");
//		for(int i=0;i<str1.length;i++)
//		{
//			System.out.println(str1[i]);
//		}
		
		StringTokenizer st=new StringTokenizer(str,";,:");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
	}
}
