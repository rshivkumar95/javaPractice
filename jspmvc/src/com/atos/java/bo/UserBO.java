package com.atos.java.bo;

import com.atos.java.bean.User;
import com.atos.java.dao.UserDAO;
import com.atos.java.exceptions.UserBusinessException;
import com.atos.java.exceptions.UserException;

public class UserBO {
	
	public boolean registerUser(User user) throws UserBusinessException, UserException
	{
		boolean successFlag=true;
		
		if(user.getId() > 1000)
		{
			throw new UserBusinessException("Invalid User");
		}
		else
		{
			UserDAO userDao=new UserDAO();
			successFlag=userDao.insertUser(user);
		}
		
		
		return successFlag;
		
		
		
	}

}
