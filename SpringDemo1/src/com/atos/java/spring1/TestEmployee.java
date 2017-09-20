package com.atos.java.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		Employee e=(Employee) fact.getBean("emp");
		System.out.println(e.toString());
		
	}

}
