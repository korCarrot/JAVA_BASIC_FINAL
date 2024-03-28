package sec05.ex01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		
		
		ServletContext context= getServletContext();
		System.out.println(context);

//		//파라미터는 초기화해야 사용가능
//		Enumeration<String> enu= context.getInitParameterNames();
//		System.out.println(enu);
//		
//		while(enu.hasMoreElements()) {
////			System.out.println(enu.nextElement());
//			String element=enu.nextElement();			
//		}
		
		String value = context.getInitParameter("hahaha");
		System.out.println(value);
		String value2 = context.getInitParameter("hahaha2");
		System.out.println(value2);
	}

}
