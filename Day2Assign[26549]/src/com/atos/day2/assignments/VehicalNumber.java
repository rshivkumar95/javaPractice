package com.atos.day2.assignments;

import java.util.Scanner;

public class VehicalNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Range Start And End Point : ");
		int m=input.nextInt();
		int n= input.nextInt();
		int sum=0;
		System.out.println("Recommended Numbers :\n");
		for(int i=m;i<=n;i++)
		{	int j=i;
			sum=0;
			while (j > 0) {
	            sum = sum + j % 10;
	            j = j / 10;
	        }
			if(sum==9){
				System.out.println(+i+"\n");
			}
	        
		}

	}

}


/* Enter the Range Start And End Point : 
1100
1120
Recommended Numbers :

1107

1116

*/
