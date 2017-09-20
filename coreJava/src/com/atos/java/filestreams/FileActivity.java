package com.atos.java.filestreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		File file=new File("c:/test.txt");
//		file.createNewFile();
		
//		File myDir=new File("Books");
//		myDir.mkdir();
		
//		File myFile=new File("Books","myFile.txt");
//		myFile.createNewFile();
		FileOutputStream fos=new FileOutputStream("shiva.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter Email ::");
		String x=dis.readLine();
		System.out.println("Enter Age :");
		int y=Integer.parseInt(dis.readLine());
//		dos.writeUTF("Name is :"+x);
//		dos.writeUTF("Age is:"+y);
		dos.writeInt(12);
		dos.writeDouble(12.7);
		dos.close();
		dis.close();

	}

}
