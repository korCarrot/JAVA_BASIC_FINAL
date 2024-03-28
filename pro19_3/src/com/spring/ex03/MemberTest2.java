package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.ex01.PersonServiceImpl;

public class MemberTest2 {

	public static void main(String[] args) {
	
		
		//스프링 방식
		//xml에서 빈 설정 후 그 객체(빈)을 주입(DI)
		
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("member.xml"));
		MemberServiceImpl mService=(MemberServiceImpl) factory.getBean("mService");
		
		mService.listMembers();

	}

}
