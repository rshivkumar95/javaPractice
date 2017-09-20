package com.atos.assignments.day3;

class MyUtil {
	
	public static int throwDice(){
		
		while(true)
		{
		  int rand=(int)Math.round((Math.random()*100)/10);
		  if(rand>0 && rand <=6)
			  return rand;
		}
			
	}
	
	public static double findAverage(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum/arr.length;
	}
	
	

}

public class TestMyUtil{
	
		public static void main(String[] args) 
		{
			    int arr[]={10,20,30,40};
				System.out.println("Dice Thrown ::"+MyUtil.throwDice());
				System.out.println("Average ::"+MyUtil.findAverage(arr));
				System.out.println("Min Between 12,15 is :"+Math.min(12, 15));
				System.out.println("Max Between 12,15 is :"+Math.max(12, 15));
				System.out.println("Ceil of 10.5 is :"+Math.ceil(10.5));
				System.out.println("Floor of 10.6 is :"+Math.floor(10.6));
				System.out.println("Round of 10.4 is :"+Math.round(10.4));			
		}
	
}

/*  
 
Dice Thrown ::4
Average ::25.0
Min Between 12,15 is :12
Max Between 12,15 is :15
Ceil of 10.5 is :11.0
Floor of 10.6 is :10.0
Round of 10.4 is :10

*/
