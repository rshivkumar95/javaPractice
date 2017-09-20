package com.rest.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Message {
	
	public Message()
	{
		
	}
	
	private long messageID;
	private String message;
	private Date created;
	private String author;
	public Message(long messageID, String message, String author) {
		super();
		this.messageID = messageID;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}
	public long getMessageID() {
		return messageID;
	}
	public void setMessageID(long messageID) {
		this.messageID = messageID;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
