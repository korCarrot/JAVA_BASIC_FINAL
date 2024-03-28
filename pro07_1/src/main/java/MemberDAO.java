import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public MemberDAO() {
	
		
		//MemberDAO 객체 초기화(생성자)시에 위 정보를 불러오게 해라!-JNDI
		
		try {
			Context ctx=new InitialContext();
			Context envContext=(Context) ctx.lookup("java:/comp/env");
			dataFactory=(DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			
			System.out.println("DB 연결을 위한 MemberDAO 객체 생성시 에러");
		}
		
	}


	// 회원목록 가져옴(그 전에 연결)
	List<MemberVO> listMembers(){
		
		List<MemberVO> memberLists=new ArrayList<MemberVO>();
		
		try {
			conn = dataFactory.getConnection();
			String sql="select * from T_MEMBER";
			pstmt=conn.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			//ResultSet rs= pstmt.executeQuery(sql);
			
			while(rs.next()) {
				String _id=rs.getString("id");
				String _pwd = rs.getString("pwd");
				String _name = rs.getString("name");
				String _email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				MemberVO vo=new MemberVO();
				 vo.setId(_id);
				 vo.setPwd(_pwd);
				 vo.setName(_name);
				 vo.setEmail(_email);
				 vo.setJoinDate(joinDate);
				
				 memberLists.add(vo);
//				System.out.println(id);
			}
			
			
		} catch (SQLException e) {
			
			System.out.println("SQL 실행시 에러");
		}
		
		return memberLists;
	}
	
	//회원 추가
	public void addMember(MemberVO memberVO){
		try {
			conn=dataFactory.getConnection();
			
			String id=memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			System.out.println(id+pwd+name+email);
			
			String query="insert into t_member(id,pwd,name,email) VALUES(?,?,?,?)";
			System.out.println("회원 추가 sql문 : " + query);
			
			pstmt=conn.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			
			pstmt.executeUpdate();  // 추가시 executeUpdate
			
			pstmt.close();
		} catch (Exception e) {
			System.out.println("회원추가시 에러");
		}
	}

}
