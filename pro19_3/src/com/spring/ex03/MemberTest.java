package com.spring.ex03;

public class MemberTest {

	public static void main(String[] args) {
		
		
		//스프링 이전 방식
		MemberService memberService	=new MemberServiceImpl();
		
		memberService.listMembers();
	}

}
