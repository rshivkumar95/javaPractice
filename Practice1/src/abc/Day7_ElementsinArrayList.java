package abc;

import java.util.*;


public class Day7_ElementsinArrayList
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		
		int count=sc.nextInt();
		while(count--!=0)
		{
			l1.add(sc.nextInt());
		}
		
		count=sc.nextInt();
		while(count--!=0)
		{
			l2.add(sc.nextInt());
		}
		
		int[] uncommon=UserMainCode.arrayListSubtractor(l1,l2);
		
		int i=0;
		while(i<uncommon.length)
		{
			System.out.print(uncommon[i]+" ");
			i++;
		}
		
		//fill your code here
						
	}
}


class UserMainCode
{
	public static int[] arrayListSubtractor(ArrayList<Integer> arrlist1,ArrayList<Integer> arrlist2)
	{
		
		//fill your code here
		
		ArrayList<Integer> AB=new ArrayList<Integer>();
		for(Integer i:arrlist1)
		{	
			if(!arrlist2.contains(i))
				AB.add(i);			
			
		}
		for(Integer i:arrlist2)
		{
			if(!arrlist1.contains(i))
				AB.add(i);
		}
		int a[]=new int[AB.size()];
		int j=0;
		for(Integer i:AB)
		{
			a[j++]=i;
		}
		return a;
	}
}





