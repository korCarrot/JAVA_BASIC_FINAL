package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/calc", "/jj"})
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("CalcServlet 서블릿 초기화 됨");
	}

	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw=response.getWriter();
		
		
		try {
			String origin=request.getParameter("origin");	
			if(origin==null || origin.equals("")) {
				pw.write("원화는 반드시 넣으셔야 합니다.");
				pw.write("<a href='http://localhost:8090/pro06/calc.html'> 환율 계산기로 가기</a>");
			}
			
			String sel=request.getParameter("sel");
			System.out.println("선택한 환율 : " + sel);
						
			if(sel.equals("dollar")) {
				int originMoney=Integer.parseInt(origin);			
				int result = originMoney / 1200 ;
				System.out.println(result);
				pw.write(result + "달라");
			}else if(sel.equals("en")) {
				int originMoney=Integer.parseInt(origin);			
				int result = originMoney / 900  ;
				System.out.println(result);
				pw.write(result + "엔화 ");
			}else if(sel.equals("wian")) {
				int originMoney=Integer.parseInt(origin);			
				int result = originMoney / 185  ;
				System.out.println(result);
				pw.write(result + "위완 ");
			}
			
			
			
			
				
			
		}catch(Exception e) {
			System.out.println("원화가 안들어감");
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
