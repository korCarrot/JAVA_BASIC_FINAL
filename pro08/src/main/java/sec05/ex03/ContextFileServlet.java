package sec05.ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/cfile")
//@WebServlet(name = "contextFileServlet", urlPatterns = {"/cfile", "/ctxfile"})
//@WebServlet(value = {"/cfile", "/ctxfile"})
//@WebServlet(urlPatterns = {"/cfile", "/ctxfile"})
@WebServlet(value = "/cfile", initParams= {@WebInitParam(name = "b", value = "banana")}, loadOnStartup = 1)


public class ContextFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		
		String str2 = getInitParameter("b");
		System.out.println(str2);
		
		ServletContext context = getServletContext();
		
		System.out.println(context.getContextPath());
		
//		InputStream is = context.getResourceAsStream("C:/Users/Administrator/eclipse-workspace/pro08/hi1.txt");
		
		//hi1, 2, 3 파일은 나중에 classpath경로로 설정 hi4, 5만(wepapp안에 파일들만)
		InputStream is = context.getResourceAsStream("/WEB-INF/hi5.txt");
		System.out.println(is);
		
		
		//바이트 기반을 문자로 변환하는 보조 스트림
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println(isr);
		
		//성능 향상 보조 스트림
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br);
		
		System.out.println(br.readLine());
		
		String str="";

		while((str=br.readLine()) != null) {
//			str=br.readLine();
			System.out.println(str);
		}
		
		
//		while(true) {
//			
//		int data= isr.read();
//		if(data==-1) {
//			break;
//		}
//		System.out.print((char)data);
//		}
//		
//		InputStream is2 = context.getResourceAsStream("/hi4.txt");
//		System.out.println(is2);

		
	
	}

}
