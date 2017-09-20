package com.atos.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		
		Customer cust=(Customer) fact.getBean("customer");
		cust.display();

	}

}
