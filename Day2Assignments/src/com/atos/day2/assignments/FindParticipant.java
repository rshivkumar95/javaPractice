package com.atos.day2.assignments;
import java.util.Scanner;

public class FindParticipant {

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int i;
       System.out.println("enter no of employees");
       int n = sc.nextInt();
       System.out.println("Enter ID's ::");
       int Emp[] = new int[n];
       for(i=0;i<n;i++)  
       {
    	  
    	   Emp[i] = sc.nextInt();
    	   
       }
       System.out.println("enter employee id for search ");
       int m = sc.nextInt();
       int flag=0;
       for(i=0;i<n;i++)
       {
    	   if(m == Emp[i])
    	   {
    		   System.out.println("entered employee id  "+m+" is present");
    		   flag=1;
    		   break;
    	   }
    	   
    	   
       }
       if(flag==0)
       {
    	   System.out.println("entered employee id  "+m+" is  not present");

       }
       
       
	}
       
}

/* enter no of employees
5
Enter ID's ::
1000 1001 1002 1003 1004
enter employee id for search 
1002
entered employee id  1002 is present


enter no of employees
5
Enter ID's ::
1000 1001 1002 1003 1004
enter employee id for search 
1345
entered employee id  1345 is  not present

*/