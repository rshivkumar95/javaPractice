package com.atos.java.filestreams;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		PrintWriter output=new PrintWriter("Employee.txt");
		output.print("Employee Details :");
		output.println("Employees Name : "+"Shiva");
		output.format("%2$s %1$4d", 123, "Hello");
		output.close();

	}

}
