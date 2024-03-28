package com.spring.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.member.service.MemberService;

public class MemberControllerImpl extends MultiActionController   implements  MemberController{

	private MemberService memberService;
	
	
	
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}



	@Override
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName=getViewName(request);
		System.out.println("뷰네임 : " + viewName );
		List membersList=memberService.listMembers();		
		ModelAndView mav = new ModelAndView(viewName);		
		mav.addObject("membersList", membersList);
		return mav;
	}

	
	// 요청명과 같은 파일명으로 나오게 하도록
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		//System.out.println("contextPath : " + contextPath);
		
		String uri = (String)request.getAttribute("javax.servlet.include.request_uri");
		//System.out.println("uri : "  + uri);
		
		if(uri == null || uri.trim().equals("")) {
	         uri = request.getRequestURI();
	         //System.out.println("null인 경우 uri: " + uri );
	      }
		 int begin = 0;
		
		 if(!((contextPath==null)||("".equals(contextPath)))){
	         begin = contextPath.length();
	         //System.out.println("begin : " + begin);
	      }
		 int end;
		 
		 //System.out.println(uri.indexOf(";"));
		 if(uri.indexOf(";")!=-1){
			 end=uri.indexOf(";");
		 }else if(uri.indexOf("?")!=-1){
	         end=uri.indexOf("?");
	      }else {
	    	  end=uri.length();
	      }
		 //System.out.println("end : " +  end );
		 String fileName=uri.substring(begin,end);
		 //System.out.println("fileName : " +fileName);
		 
		 if(fileName.indexOf(".")!=-1){
	         fileName=fileName.substring(0,fileName.lastIndexOf("."));
	         //System.out.println("fileName : " +fileName);
	      }
		 if(fileName.lastIndexOf("/")!=-1){			 
	         fileName=fileName.substring(fileName.lastIndexOf("/"),fileName.length());
	         //System.out.println("fileName : " +fileName);
	      }
		 
		return fileName;
	}
}
