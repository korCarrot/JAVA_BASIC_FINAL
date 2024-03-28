package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch4")
public class Ch4Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 out.write("<HTML><HEAD><TITLE></TITLE></HEAD><BODY>");
		 
		 for(int i=1;i <= 10; i++) {
			 out.write("" + i +  "<br>");
		 }
		 
		 
		 
		 out.write("</BODY></HTML>");
	}

}
