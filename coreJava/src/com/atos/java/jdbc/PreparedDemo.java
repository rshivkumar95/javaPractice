package com.atos.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedDemo {

	
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
			
			
			Statement st=conn.createStatement();
			ResultSet result=st.executeQuery(sql);
			while(result.next())
			  bill_no=result.getInt(1)+101;
			System.out.println("Bill No ::"+bill_no);
			sql="Insert into bill_master(billno,customer_name,amount) values("+bill_no+",?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			System.out.println("Enter Customer Name :");
			pst.setString(1, sc.next());
			System.out.println("Enter Amounr Name :");
			pst.setInt(2, sc.nextInt());
			
			int insertCount=pst.executeUpdate();
			
			System.out.println(insertCount+" rows inserted");
			
			sql="Select * from bill_master";
			
			Statement st1=conn.createStatement();
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
