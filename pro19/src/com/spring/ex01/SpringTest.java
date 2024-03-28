package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
//XmlBeanFactory XML 문서에서 빈 정의를 읽는
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringTest {

	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonService p1=(PersonService) factory.getBean("p1");
		p1.sayHello();
	}

}
