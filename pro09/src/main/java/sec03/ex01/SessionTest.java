package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		System.out.println("hi");
		
		
		HttpSession session =request.getSession();	//브라우저별로 다르다.
		System.out.println(session.isNew());
		System.out.println(session.getId());
		System.out.println(new Date(session.getCreationTime()));
//		System.out.println(session.getCreationTime()); Date로 찍어야 자세히 나옴
		System.out.println(session.isNew());
		System.out.println(session.getMaxInactiveInterval());	//톰캣서버의 web.xml에서 <session-config>를 가보면 세션 지속시간 확인가능
		
		System.out.println("-----------------");
		//session.invalidate(); //세션 삭제. 세션이 삭제된 상ㅌ
		

		
		out.write("hi");
		out.close();
	}

}
