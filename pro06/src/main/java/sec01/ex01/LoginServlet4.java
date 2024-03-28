package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login2")
public class LoginServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("로그인 서블릿 초기화");
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
		
	}	
	
	void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("여기는 post와 get 로 요청시 등러옴");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String hid=request.getParameter("hid");
		System.out.println(hid);
		
		PrintWriter pw=response.getWriter();
		pw.write(hid);
		pw.close();
	}

}
