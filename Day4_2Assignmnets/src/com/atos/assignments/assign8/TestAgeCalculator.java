package com.atos.assignments.assign8;

import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculator {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date in dd/mm/yyyy format");
		System.out.println(AgeCalculator.calculateAge(sc.next()));

	}

}


/*
Enter Date in dd/mm/yyyy format
04/03/1995
22 year(s) 5 month(s)
*/