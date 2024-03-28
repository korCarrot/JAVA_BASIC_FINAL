package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/input")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("InputServlet 초기화됨");
	}

	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
//		String values[] = request.getParameterValues("menu");
//		
//		for(String value : values) {
//			System.out.println(value);
//		}
//		
//		String values2[] = request.getParameterValues("gender");
//		
//		for(String value : values2) {
//			System.out.println(value);
//		}
		PrintWriter pw=response.getWriter();
		
		Enumeration<String> enus=request.getParameterNames();
		//enus.hasMoreElements()
		String values[]=null;
		while(enus.hasMoreElements()) {
			String name=enus.nextElement();
			 values=request.getParameterValues(name);
			 pw.write(Arrays.toString(values));
			for(String value : values) {
				pw.write(value);
				System.out.println(name + " : "  + value);	
			}
			
						
		}
		
				
		//System.out.println(enus);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	public void destroy() {
		System.out.println("InputServlet 소멸");
	}

}
