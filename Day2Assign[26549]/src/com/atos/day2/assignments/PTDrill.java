package com.atos.day2.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PTDrill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students ::");
		int no=sc.nextInt();
		
		int sqrtNo=(int) Math.sqrt(no);
		if((sqrtNo*sqrtNo)!=no)
		{
			System.out.println("Plz Enter Valid Square of Odd Number ");
			return;
		}
		else
		{
			System.out.println("\nEnter Student Names ::");
			String stud[]=new String[no];
			for(int i=0;i<no;i++)
			{
				
					stud[i]=sc.next();
				
			}
			
			Arrays.sort(stud);
			
			String sorted[][]=new String[sqrtNo][sqrtNo];
			int k=0;
			for(int i=0;i<sqrtNo;i++)
			{
				for(int j=0;j<sqrtNo;j++)
				{
					sorted[i][j]=stud[k];
					k++;
				}
			}
			
			System.out.println("Middle Row ::");
			for(int i=0;i<sqrtNo;i++)
			{
				System.out.print(sorted[1][i]+" ");
			}
			
			System.out.println("\nMiddle Column ::");
			for(int i=0;i<sqrtNo;i++)
			{
				System.out.print(sorted[i][1]+" ");
			}
			
			
		}
		
	}

}

/*
Enter Number of Students ::
9

Enter Student Names ::
Amy Bob Abu Bek Ean Ira Kim Poe Nik
Middle Row ::
Bob Ean Ira 
Middle Column ::
Amy Ean Nik 



Enter Number of Students ::
10
Plz Enter Valid Square of Odd Number 

*/