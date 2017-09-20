package com.atos.day2.assignments;

import java.util.Scanner;

public class CircleData {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		float radius;
		System.out.println("Enter Radius :");
		radius=sc.nextFloat();
		String code;
		while(true){
			System.out.println(":: Options ::");
			System.out.println("Diameter[DIA]");
			System.out.println("Area[AR]");
			System.out.println("Perimeter[PER]");
			System.out.println("Area of Semi Circle[ARSEM]");
			System.out.println("Exit[EXIT]\nEnter Code :");
			code=sc.next();
			
			if(code.equals("DIA")){
				
				System.out.println("Diameter ::" + (2 * radius));
			}
			else if(code.equals("AR"))
			{
				System.out.println("Area ::"+(3.14*(radius*radius)));
			}
			else if(code.equals("PER"))
			{
				System.out.println("Perimeter ::"+(2*3.14*radius));
			}
			else if(code.equals("ARSEM"))
			{
				System.out.println("Area of Semi Circle ::"+(3.14*radius));
			}
			else if(code.equals("EXIT"))
			{
				System.out.println("Thank You !");
				return;
			}
			else{
				System.out.println("Invalid Input !");
			}
		}
		

	}

}


/*
 
 Enter Radius :
10
:: Options ::
Diameter[DIA]
Area[AR]
Perimeter[PER]
Area of Semi Circle[ARSEM]
Exit[EXIT]
Enter Code :
DIA
Diameter ::20.0
:: Options ::
Diameter[DIA]
Area[AR]
Perimeter[PER]
Area of Semi Circle[ARSEM]
Exit[EXIT]
Enter Code :
AR
Area ::314.0
:: Options ::
Diameter[DIA]
Area[AR]
Perimeter[PER]
Area of Semi Circle[ARSEM]
Exit[EXIT]
Enter Code :
PER
Perimeter ::62.800000000000004
:: Options ::
Diameter[DIA]
Area[AR]
Perimeter[PER]
Area of Semi Circle[ARSEM]
Exit[EXIT]
Enter Code :
ARSEM
Area of Semi Circle ::31.400000000000002
:: Options ::
Diameter[DIA]
Area[AR]
Perimeter[PER]
Area of Semi Circle[ARSEM]
Exit[EXIT]
Enter Code :
asd
Invalid Input !
:: Options ::
Diameter[DIA]
Area[AR]
Perimeter[PER]
Area of Semi Circle[ARSEM]
Exit[EXIT]
Enter Code :
EXIT
Thank You !

 
*/