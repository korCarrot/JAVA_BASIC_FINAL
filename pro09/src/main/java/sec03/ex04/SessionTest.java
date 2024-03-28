package sec03.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/login")
public class SessionTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println(user_id + user_pw);
		System.out.println(session.isNew());
		if(session.isNew()) {
			if(user_id.equals("") || user_pw.equals("")) {
				out.print("id와 패스워드 반드시 입력</a>");
				out.print("<a href='login2.html'>다시 로그인 하세요!!</a>");
			}
			
			
//			if(user_id != null  || user_id.length() != 0){
//				session.setAttribute("user_id", user_id);
//				out.println("<a href='login'>로그인 상태 확인</a>");
//			}else if(user_id.equals("")) {
//				out.print("<a href='login2.html'>id 입력 안함('') - 다시 로그인 하세요!!</a>");
//			}else if(user_id.length() == 0) {
//				out.print("<a href='login2.html'>id 입력 안함(길이 0) - 다시 로그인 하세요!!</a>");
//			}else {
//				out.print("<a href='login2.html'>다시 로그인 하세요!!</a>");
//				//session.invalidate();	//세션 무효화 후 다시 로그인하도록 해야 함
//			}
			
		}else {
			user_id = (String) session.getAttribute("user_id");
			System.out.println(user_id);
			if (user_id != null && user_id.length() != 0) {
				out.print("안녕하세요 " + user_id + "님!!!");
		}
		
}
}
}
