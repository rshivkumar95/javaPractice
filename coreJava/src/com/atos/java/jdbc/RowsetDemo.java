package com.atos.java.jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JdbcRowSet rs;
		try {
			rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("hr");
			rs.setPassword("hr");
			rs.setCommand("select * from countries");
			rs.execute();
			
			while(rs.next())
			{
				System.out.println(rs.getString("Country_id")+"\t"+rs.getString("country_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
