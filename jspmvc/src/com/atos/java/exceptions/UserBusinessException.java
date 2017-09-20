package com.atos.java.exceptions;

public class UserBusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserBusinessException(String message)
	{
		super(message);
	}
	
	public UserBusinessException(Throwable t)
	{
		super(t);
	}

}
