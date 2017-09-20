package com.database;

import com.rest.model.*;

import java.util.*;


public class TableData {
	public static Map<Long,Profile> map=new HashMap(); 
	public static Map<Long,Profile> getMessages()
	{
		return map;
	}
	
	public static Map<Long,Stock> map1=new HashMap(); 
	public static Map<Long,Stock> getStocks()
	{
		return map1;
	}
}
