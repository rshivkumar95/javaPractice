package com.atos.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		Staff s=(Staff)fact.getBean("staff");
		s.display();

	}

}
