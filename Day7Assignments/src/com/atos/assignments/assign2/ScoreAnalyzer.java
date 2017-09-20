package com.atos.assignments.assign2;

import java.util.LinkedList;

public class ScoreAnalyzer {
	
	private static LinkedList<Integer> runsData;
	
	public ScoreAnalyzer()
	{
		runsData=new LinkedList<Integer>();
	}
	
	public void addRunstoList(int run)
	{
		runsData.add(run);
	}
	
	public double calRunRate()
	{
		double sum=0;
		for(int run:runsData)
		  sum=sum+run;
		double runrate=sum/50;
		System.out.println(runrate);
		return runrate;
	}
	
	public int lowestRunScored()
	{
		int low=runsData.get(1);
		for(int run:runsData)
		  if(low>run)
			  low=run;
		return low;
	}
	
	public void displayRuns()
	{
		System.out.println("Runs Scored by all players ::");
		int i=1;
		for(int run:runsData)
		{
			System.out.print((i++)+"-"+run+"  ");
		}
		  
	}
	
	public int count()
	{
		return runsData.size();
	}

}
