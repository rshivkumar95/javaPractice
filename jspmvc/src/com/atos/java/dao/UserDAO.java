package com.atos.java.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.atos.java.bean.User;
import com.atos.java.exceptions.UserException;

public class UserDAO {

	
	String url="jdbc:oracle:thin:@localhost:1521/xe";
	String un="hr";
	String pwd="hr";
	private java.sql.Connection createConnection()throws SQLException
	{
		Driver driver=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection(url,un,pwd);
	}
	
	
	public boolean insertUser(User user)throws UserException {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		try{
			Connection con=createConnection();
			String queryString="insert into userinfo values(?,?)";
			PreparedStatement prepStatement=con.prepareStatement(queryString);
			
			prepStatement.setInt(1, user.getId());
			prepStatement.setString(2, user.getName());
			
			if(prepStatement.executeUpdate() > 0)
			{
				flag=true;
			}
			
		}
		catch(SQLException e)
		{
			throw new UserException(e);
		}
		
		
		return flag;
	}

}
