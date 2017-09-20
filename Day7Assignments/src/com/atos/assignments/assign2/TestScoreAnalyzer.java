package com.atos.assignments.assign2;

import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreAnalyzer sa=new ScoreAnalyzer();
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Run for A Player");
		sa.addRunstoList(sc.nextInt());
		System.out.println("add More ? (y/n)");
		if(sc.next().equalsIgnoreCase("n"))
			break;
		}
		
		sa.displayRuns();
		
		System.out.println("\nRun Rate ::"+sa.calRunRate());
		System.out.println("\nLowest Run ::"+sa.lowestRunScored());
		System.out.println("\nCount of Player who batted ::"+sa.count());
	}

}

/*

Enter Run for A Player
20
add More ? (y/n)
y
Enter Run for A Player
30
add More ? (y/n)
y
Enter Run for A Player
150
add More ? (y/n)
y
Enter Run for A Player
50
add More ? (y/n)
y
Enter Run for A Player
2
add More ? (y/n)
n
Runs Scored by all players ::
1-20  2-30  3-150  4-50  5-2  5.04

Run Rate ::5.04

Lowest Run ::2

Count of Player who batted ::5
*/
