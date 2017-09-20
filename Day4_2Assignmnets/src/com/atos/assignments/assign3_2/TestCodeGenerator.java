package com.atos.assignments.assign3_2;

import java.util.Scanner;

public class TestCodeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodeGeneration cg=new CodeGeneration();
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.next());
		System.out.println(cg.generateCode(sb).toString().toUpperCase());

	}

}
