package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.rest.model.Message;

public class MessageService {
	
	List<Message> list=new ArrayList<Message>();
	
	public MessageService()
	{
		list.add(new Message(1l,"Rest","Roy Fielding"));
		list.add(new Message(2l,"Java","James Gosline"));
		
		
	}

	public List<Message> getAllMessage()
	{
		
		
		return list;
	}
	
	public Message getMessage(long id)
	{
		
		for(Message m:list)
		{
			System.out.println(m.getMessageID());
			long id1=m.getMessageID();
			if(id1==id)
				return m;
		}
		return new Message();
	}

}
