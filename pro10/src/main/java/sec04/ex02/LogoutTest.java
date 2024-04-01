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

//@WebServlet("/logout")
public class LogoutTest extends HttpServlet {
	ServletContext context = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		context = getServletContext();
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String user_id = request.getParameter("user_id");

		session.invalidate();	//동일인물이 아님을 알기 위해 제거하나 싶음. 로그아웃시 세션 삭제.

		List user_list = (ArrayList) context.getAttribute("user_list");
		user_list.remove(user_id);
		
		context.removeAttribute("user_list");
		context.setAttribute("user_list", user_list);
		out.println("<br>로그아웃 했습니다.");
	}

}