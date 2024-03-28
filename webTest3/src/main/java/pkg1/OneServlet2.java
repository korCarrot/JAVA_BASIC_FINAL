package pkg1;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value = "/one")
public class OneServlet2 extends HttpServlet {
	//serialVersionUID 필드
//	직렬화할 때 사용된 클래스와 역직렬화할 때 사용된 클래스는 동일한 클래스여야 함 
//	클래스 내용이 다르더라도 두 클래스가 동일한 serialVersionUID 상수값을 가지면 역직렬화 가능 

	//private static final long serialVersionUID = 1L;

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화됨2");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		System.out.println("GET 요청이 들어옴2");
		
		
		//request.setCharacterEncoding("utf-8");
		
		PrintWriter  pw=response.getWriter(); //클라이언트에 문자 텍스트를 보낼 수 있는 PrintWriter  객체를 반환합니다.
		
		//response.setContentType("text/html;charset=utf-8");
		//pw.write("hi \nnice3");
		pw.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
//				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "hi222<br>\r\n"
				+ "안녕2222하하333감사555쿠쿠쿠777포퐆포\r\n"
				+ "</body>\r\n"
				+ "</html>");
		pw.close();
	}
	
	
	@Override
	public void destroy() {
	System.out.println(" 서블릿 종료");
	}

}
