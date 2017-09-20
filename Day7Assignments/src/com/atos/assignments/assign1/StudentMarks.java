package com.atos.assignments.assign1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.jws.soap.SOAPBinding;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class StudentMarks {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(34);
		marks.add(89);
		marks.add(90);
		marks.add(34);
		marks.add(56);
		marks.add(57);
		marks.add(43);
		marks.add(69);
		marks.add(94);
		marks.add(56);
		
		// MANUAL WAY
		
		int sum=0;
		int max=0;
		int max2=0;
		int third=0;
		for(int mark:marks)
		{
			if(mark > max)
			{
				third=max2;
				max2=max;
				max=mark;								
			}
			sum=sum+mark;			
		}
		
		System.out.println("Max Marks :: "+max);
		System.out.println("Average Marks ::"+sum/marks.size());
		System.out.println("Third Maximum ::"+third);
		Collections.sort(marks);
		System.out.println("Sorted List ::");
		Iterator it=marks.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		// USING BUILT IN FUNCTIONS
		
		sum=0;
		Collections.sort(marks);
		for(int mark:marks)
		{
			sum=sum+mark;			
		}
		System.out.println("\n\nAverage ::"+sum/marks.size());
		System.out.println("Max Marks::"+marks.get((marks.size()-1)));
		System.out.println("Third Max Marks::"+marks.get((marks.size()-3)));
		System.out.println("Sorted List ::");
		it=marks.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
	}
}
