package com.atos.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CallableDemo {

	
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		
		
		Connection conn=null;
		String sql="select count(*) from bill_master";
		int bill_no=0;
		try {
			
			
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);
			
			
			sql="Select * from bill_master";
			
			Statement st1=conn.createStatement();
			ResultSet result=st1.executeQuery(sql);
			
			while(result.next())
			{
				System.out.println(result.getInt("BILLNO")+"\t"+result.getString("CUSTOMER_NAME")+"\t"+result.getInt("AMOUNT"));
			}
			
			System.out.println("Enter Bill no. to delete ::");
			
			CallableStatement stmt=conn.prepareCall("{call bill_delete(?)}"); 
			stmt.setInt(1, sc.nextInt());
			int row=stmt.executeUpdate();
	
			System.out.println(row+" deleted");
			
			result=st1.executeQuery(sql);
			
			while(result.next())
			{
				System.out.println(result.getInt("BILLNO")+"\t"+result.getString("CUSTOMER_NAME")+"\t"+result.getInt("AMOUNT"));
			}

			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
