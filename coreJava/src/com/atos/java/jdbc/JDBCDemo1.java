package com.atos.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID="hr";
	private static final String PASSWORD="hr";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String sql1="Select * from countries";
		final String sql="update countries set country_name='Bharat' where country_id='IN'";
		Connection conn=null;
		try{
			
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(DB_URL,USER_ID,PASSWORD);
			Statement statement=conn.createStatement();
			statement.executeUpdate(sql);
			ResultSet result=statement.executeQuery(sql1);
			
			ResultSetMetaData rsmd=result.getMetaData();
			
			
			int numcol=rsmd.getColumnCount();
			System.out.println(numcol);
			for(int i=1;i<=numcol;i++)
			{
				System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
				System.out.println(rsmd.getTableName(i));
			}
			
			
			//while(result.next())
			//{
			//	System.out.println(result.getString("Country_ID")+"\t"+result.getString("country_name"));
			//}
			//System.out.println("No. of Rows ::"+result.rows);
			//result.last();
//			System.out.println(result.getString("Country_ID")+"\t"+result.getString("country_name"));
//			System.out.println(result.getRow());
			
			//result.relative(4);
			//result.beforeFirst();
//			result.next();
//			result.relative(4);
//			result.previous();
//			System.out.println(result.getString("Country_ID")+"\t"+result.getString("country_name"));
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}
