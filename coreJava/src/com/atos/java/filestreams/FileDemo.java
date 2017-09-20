package com.atos.java.filestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		String str="This is an example";
//		byte[] b=str.getBytes();
//		
//		FileOutputStream fs=new FileOutputStream("D:/java/coreJava/src/com/atos/java/filestreams/FileActivity.java");
//		
//		for(int i=0;i<b.length;i++)
//			fs.write((char)b[i]);
//		System.out.print("File Written Successfully . . .");
//		fs.close();
		
		FileWriter fw=new FileWriter("Employee.txt");
		String str="Learning java is easy";
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			fw.write(c[i]);
		}
		fw.close();
		
		FileReader fr=new FileReader("Employee.txt");
		char[] c1=new char[21];
		fr.read(c1);
		for(char x:c1)
			System.out.print(x);
		
		fr.close();
	}

}
