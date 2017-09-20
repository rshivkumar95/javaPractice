package com.atos.java.spring.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.atos.java.spring1.Employee;

public class TrainerInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		Trainer t=(Trainer) fact.getBean("tnr");
		System.out.println(t.getName());
		System.out.println(t.getAd1());

	}

}
