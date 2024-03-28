package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Persontest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonServiceImpl p1=(PersonServiceImpl) factory.getBean("p1");
		
		PersonServiceImpl p2=(PersonServiceImpl) factory.getBean("p2");
		
//		p1.sayHello();

		p2.sayHello();
		
	}

}
