package com.atos.java.classess;

class Exp
{
	public void print()
	{
	   System.out.println("Super..");	
	}
}

public class Present extends Exp{

	public void print()
	{
		System.out.println("Sub.. ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exp e=new Exp();
		e.print();
		Present p=new Present();
		p.print();

	}

}
