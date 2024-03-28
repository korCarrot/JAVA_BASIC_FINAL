package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/login")
public class LoginTest extends HttpServlet {
	
	ServletContext context = null;	//null로 안하고 가져오면 오류
	List user_list = new ArrayList();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		context = getServletContext();
		PrintWriter out = response.getWriter();
		HttpSession session =request.getSession();	//세션이 만들어지면 HttpSessionListener의 메소드들 실행

		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		LoginImpl loginUser = new LoginImpl(user_id, user_pw);	//세션 생성이 왜 두 번? -> 애플리케이션 내에 다른 패키지에 HttpSessionListener를 implements를 한 클래스가 있음. 주석처리하면 1번 
		System.out.println(LoginImpl.total_user);
		
		if(session.isNew()) {
			session.setAttribute("loginUser", loginUser);
			user_list.add(user_id);
			context.setAttribute("user_list", user_list);
		}
		
		out.println("<html><body>");
		out.println("아이디는 " + loginUser.user_id + "<br>");
		out.println("총 접속자수는" + LoginImpl.total_user + "<br><br>");
		out.println("접속 아이디:<br>");
		List list = (ArrayList) context.getAttribute("user_list");
		for (int i = 0; i < list.size(); i++) {
			out.println(list.get(i) + "<br>");
		}
		out.println("<a href='logout?user_id=" + user_id + "'>로그아웃 </a>");
		out.println("</body></html>");
		
		}
}
