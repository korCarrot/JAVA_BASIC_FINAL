

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw= response.getWriter();
		System.out.println("doHandle 메서드");
		
		String command=request.getParameter("command");
		System.out.println("커맨드" + command);
		
		MemberDAO  memberDAO= new MemberDAO();
		if(command==null ) {
			
			System.out.println(memberDAO);
			
			List<MemberVO> memberLists= memberDAO.listMembers();
			System.out.println(memberLists);
			
			
			
			pw.write("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "	<meta charset=\"utf-8\">	\r\n"
					+ "	<title></title>\r\n" + "    <style>\r\n" + "        table, tr,  th, td {\r\n"
					+ "            border: solid 2px black;\r\n" + "            border-collapse: collapse;\r\n"
					+ "            padding: 8px;\r\n" + "\r\n" + "        }\r\n" + "    </style> \r\n" + "</head>\r\n"
					+ "<body>\r\n" + "<table>\r\n"
					+ "    <tr><th>아이디**</th><th>비밀먼호</th><th>이름</th><th>이메일</th><th>가입일</th></tr>\r\n" + "\r\n");

			for (int i = 0; i < memberLists.size(); i++) {

				String id = memberLists.get(i).getId();
				String pwd = memberLists.get(i).getPwd();
				String name = memberLists.get(i).getName();
				String email = memberLists.get(i).getEmail();
				Date joinDate = memberLists.get(i).getJoinDate();

				pw.write("<tr><td>" + id + "</td><td>" + pwd + " </td><td>" + name + "</td><td>" + email + "</td><td>"
						+ joinDate + "</td></tr>\r\n");

			}

			pw.write("</table>\r\n" + "</body>\r\n" + "</html>");
			
		}else if(command!=null   && command.equals("addMember")) {
			String id=request.getParameter("id");
			String pwd=request.getParameter("pwd");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			System.out.println(id+pwd+name+email);
			
			MemberVO vo=new MemberVO();
			 
			 vo.setId(id);
			 vo.setPwd(pwd);
			 vo.setName(name);
			 vo.setEmail(email);
			memberDAO.addMember(vo);
			System.out.println("회원 추가함");
			
			
		}else if(command.equals("delMember")) {
			
		}else {
			
//			System.out.println(memberDAO);
			
			List<MemberVO> memberLists= memberDAO.listMembers();
			System.out.println(memberLists);
			
			
			
			pw.write("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "	<meta charset=\"utf-8\">	\r\n"
					+ "	<title></title>\r\n" + "    <style>\r\n" + "        table, tr,  th, td {\r\n"
					+ "            border: solid 2px black;\r\n" + "            border-collapse: collapse;\r\n"
					+ "            padding: 8px;\r\n" + "\r\n" + "        }\r\n" + "    </style> \r\n" + "</head>\r\n"
					+ "<body>\r\n" + "<table>\r\n"
					+ "    <tr><th>아이디**</th><th>비밀먼호</th><th>이름</th><th>이메일</th><th>가입일</th></tr>\r\n" + "\r\n");

			for (int i = 0; i < memberLists.size(); i++) {

				String id = memberLists.get(i).getId();
				String pwd = memberLists.get(i).getPwd();
				String name = memberLists.get(i).getName();
				String email = memberLists.get(i).getEmail();
				Date joinDate = memberLists.get(i).getJoinDate();

				pw.write("<tr><td>" + id + "</td><td>" + pwd + " </td><td>" + name + "</td><td>" + email + "</td><td>"
						+ joinDate + "</td></tr>\r\n");

			}

			pw.write("</table>\r\n" + "</body>\r\n" + "</html>");
		}
		
		
		
		
		
		pw.close();
		
		
		
		
		
	}
	
}
