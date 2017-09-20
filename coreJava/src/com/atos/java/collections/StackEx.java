package com.atos.java.collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<>();
		int a=st.push(45);
		System.out.println(a);
		System.out.println("Pushed :"+st.push(78));
		st.push(23);
		st.push(789);
		System.out.println(st);
		System.out.println("Popped :"+st.pop());
		int b=st.pop();
		System.out.println(b);
		System.out.println(st.peek());
		
		
	}

}
