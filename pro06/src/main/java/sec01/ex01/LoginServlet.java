package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("로그인 서블릿 초기화");
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 get 요청시 들어옴");
		
//		String id = request.getParameter("id");
//		System.out.println(id);
//		String password = request.getParameter("password");
//		System.out.println(password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 post로 요청시 등러옴");
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter pw=response.getWriter();
//		
		String id = request.getParameter("id");
		System.out.println(id);
//		String password = request.getParameter("password");
//		System.out.println(password);
//		
//		pw.write("<!DOCTYPE html>\r\n"
//				+ "<html>\r\n"
//				+ "<head>\r\n"				
//				+ "<meta charset=\"UTF-8\">\r\n"
//				+ "<title>Insert title here</title>\r\n"
//				+ "</head>\r\n"
//				+ "<body>\r\n"
//				+ "hi<br>\r\n"
//				+ "반갑습니다.\r\n"
//				+ id + "님"
//				+ "</body>\r\n"
//				+ "</html>");
//		
		
		
	}

}
