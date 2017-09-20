package com.atos.assignments.assign6;

import java.text.ParseException;
import java.util.Scanner;

public class TestFormatChanger {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format ::");
		System.out.println("Converted Date ::"+FormatChanger.changeFormat(sc.next()));
	}
}

/* 

Enter date in dd/mm/yyyy format ::
01/02/2017
Converted Date ::2017-02-01

*/
