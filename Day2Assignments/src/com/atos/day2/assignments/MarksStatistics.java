package com.atos.day2.assignments;

import java.util.Scanner;

public class MarksStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Students ::");
		int no=sc.nextInt();
		
		int marks[]=new int[no];
		System.out.println("Enter Marks Scored ::");
		for(int i=0;i<no;i++)
		{
			marks[i]=sc.nextInt();
		}
		int min=marks[0],max=marks[0];
		int sum=0;
		for(int i=0;i<no;i++)
		{
			if(marks[i]<min)
				min=marks[i];
			if(marks[i]>max)
				max=marks[i];
			sum=sum+marks[i];
		}
		
		System.out.println("Minimum Marks ::"+min);
		System.out.println("Maximum Marks ::"+max);
		System.out.println("Average Marks ::"+(sum/no));		
	}
}

/*

Enter No. of Students ::
5
Enter Marks Scored ::
85 65 55 75 90
Minimum Marks ::55
Maximum Marks ::90
Average Marks ::74 

*/