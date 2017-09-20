package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.rest.model.Profile;

public class DAO {
	
	
	Connection conn=DataBaseClass.getDBConnection();
	

	public int insertMessageData(Profile m)throws SQLException{
		
		PreparedStatement pst=conn.prepareStatement("insert into profiledata values(?,?,?,?)");
		pst.setLong(1, m.getId());
		pst.setString(2, m.getProfileName());
		pst.setString(3, m.getFirstName());
		pst.setString(4, m.getLastName());
		
		return pst.executeUpdate();
	}
	
public int updateData(Profile m)throws SQLException{
		
		PreparedStatement pst=conn.prepareStatement("update profiledata set profilename=?, firstname=?, lastname=? where id=?");
	
		pst.setString(1, m.getProfileName());
		pst.setString(2, m.getFirstName());
		pst.setString(3, m.getLastName());
		pst.setLong(4, m.getId());
		
		return pst.executeUpdate();
	}


public int deleteData(long id)throws SQLException{
	
	Statement stmt = conn.createStatement();
    String sql = "DELETE FROM profiledata " +
                 "WHERE id ="+id;
    return stmt.executeUpdate(sql);
	
	
}
	
	

}
