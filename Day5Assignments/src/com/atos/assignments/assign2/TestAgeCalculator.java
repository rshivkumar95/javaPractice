package com.atos.assignments.assign2;

import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculator {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter DOB in dd/mm/yyyy format");
		System.out.println(AgeCalculator.calculateAge(sc.next()));

	}

}


/*
04/03/1995
22

*/