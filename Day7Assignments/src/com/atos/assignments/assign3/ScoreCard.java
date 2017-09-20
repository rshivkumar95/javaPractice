package com.atos.assignments.assign3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> scores=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total No. of batsmen ::");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Batsman Name & Score::");
			scores.put(sc.next(), sc.nextInt());
		}
		
		Set<String> s=scores.keySet();
		Iterator<String> si=s.iterator();
		//Collections.sort(scores);
		System.out.println("\n\nPlayers Who Batted ::");
		while(si.hasNext())
		{
			System.out.println(si.next());
		}
		System.out.println("\n\nScores by players ::");
		Iterator<String> it=s.iterator();
		int total=0;
		String highestScorer="";
		int highScore=0;
		int runByDhoni=0;
		while(it.hasNext())
		{
			String key=it.next();
			System.out.println(key+" : "+scores.get(key));
			total=total+scores.get(key);
			if(scores.get(key)>highScore)
			{
			   highScore=scores.get(key);
			   highestScorer=key;
			}
			if(key.equalsIgnoreCase("dhoni"))
			   runByDhoni=scores.get(key);
		}
		
		System.out.println("Total Score :: "+total);
		System.out.println("Name of the highest scorer :: "+highestScorer);
		System.out.println("Run Scored by Dhoni :: "+runByDhoni);
	
	}

}

/* 
 
Enter Total No. of batsmen ::
5
Enter Batsman Name & Score::
rahane 20
Enter Batsman Name & Score::
rahul 30
Enter Batsman Name & Score::
kohli 150
Enter Batsman Name & Score::
dhoni 50
Enter Batsman Name & Score::
lokesh 2


Players Who Batted ::
rahul
dhoni
kohli
lokesh
rahane


Scores by players ::
rahul : 30
dhoni : 50
kohli : 150
lokesh : 2
rahane : 20
Total Score :: 252
Name of the highest scorer :: kohli
Run Scored by Dhoni :: 50
*/
