package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.rest.model.Profile;

public class DataBaseClass {
	
	
		
		public static Connection getDBConnection(){
			Connection conn = null;
			try{
			Class.forName("oracle.jdbc.OracleDriver");
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr", "hr");
			}
			catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
			}
			
			if(conn!=null){
				System.out.println("Database Connected");
			}
			else{
				System.err.println("Error Connecting to the database");
			}
			return conn;
		}


}
