package com.atos.assignments.day3;


class Averager{
	
	public static double avg(int x,int y)
	{
		return (x+y)/2;	
	}
	public static double avg(int x,int y,int z)
	{
		return (x+y+z)/3;	
	}
	public static double avg(double x,double y)
	{
		return (x+y)/2;	
	}
}
public class MethodOverloading {
		 public static void main(String[] args) {
		   System.out.println("Average (2 Param) :: "+Averager.avg(15, 20));
		   System.out.println("Average (3 Param) ::"+Averager.avg(12, 90, 45));
		   System.out.println("Average (2 Double) ::"+Averager.avg(12.8, 67.9));
		}
}

/* 
Average (2 Param) :: 17.0
Average (3 Param) ::49.0
Average (2 Double) ::40.35  */