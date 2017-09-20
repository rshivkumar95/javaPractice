package assignment1;

import java.util.*;
public class AverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter marks of 5 students :");
		for(int i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++)
		{
			sum=sum+marks[i];
			
		}
		System.out.println("Average ::" + (sum/5));

	}

}
