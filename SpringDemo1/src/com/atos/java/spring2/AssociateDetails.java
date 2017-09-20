package com.atos.java.spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.atos.java.spring1.Employee;

public class AssociateDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		Associate e=(Associate) fact.getBean("asc");
		e.show();

	}

}
