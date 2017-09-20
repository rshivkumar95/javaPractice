package com.atos.day2.assignments;

import java.util.Scanner;

public class ClassRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int classRoom[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter C"+(i+1)+" Capacity ::");
			classRoom[i]=sc.nextInt();
		}
		
		System.out.println("Enter No. of Students ::");
		int no=sc.nextInt();
		int count=0;
		for(int i=0;i<3;i++)
		{
			if(no<=classRoom[i])
				count++;
		}
		
		if(count==0)
		{
			System.out.println("None of the labs can accomodate "+no+" Students");
		}
		else
		{
			System.out.println(count+"lab(s) can accomodate "+no+" Students");
		}
	}

}

/*
 Enter C1 Capacity ::
30
Enter C2 Capacity ::
40
Enter C3 Capacity ::
20
Enter No. of Students ::
25
2lab(s) can accomodate 25 Students


Enter C1 Capacity ::
30
Enter C2 Capacity ::
40
Enter C3 Capacity ::
25
Enter No. of Students ::
50
None of the labs can accomodate 50 Students
 
 
 */
