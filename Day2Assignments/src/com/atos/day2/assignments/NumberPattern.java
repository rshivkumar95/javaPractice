package com.atos.day2.assignments;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of Rows : ");
		int noOfrows=input.nextInt();
		for(int i=1;i<=noOfrows;i++){
			for(int j=1;j<=i;j++){
				if(i!=3){
					System.out.print(+i);
				}
			}
			if(i!=3)
			System.out.println();
		}

	}

}

/*
 
 Enter the no of Rows : 
5
1
22
4444
55555
 
 */
