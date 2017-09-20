package com.atos.java.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
interface TestInf{int a=12;}
class Atom {
Atom() { System.out.print("atom "); }
}
class Rock extends Atom {
Rock(String type) { System.out.print(type); }
}
public class Mountain extends Rock {
Mountain() {
super("granite ");
new Rock("granite ");
}
static int k=0;
public static void main(String[] args) {
	for(int i=2;i<5;i++)
	{
	for(int j=2;j<5; j+=3)
	{
	System.out.println((k+=3) *(++i));
	}
	}
	new Mountain(); }
}