package com.spring.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.spring.member.vo.MemberVO;


@Repository("memberDAO")
public class MemberDAOImpl  implements MemberDAO{

	//Spring의 의존성 주입 기능에 의해 자동 연결되도록 생성자, 필드, setter 메소드 또는 구성 메소드를 표시합니다.
	@Autowired
	private SqlSession sqlSession;
	
	
	
	
	
	
//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}






	@Override
	public List<MemberVO> listMembers() throws DataAccessException {
//		System.out.println("sqlSession : " + sqlSession);
		 List<MemberVO> memberList=sqlSession.selectList("mapper.member.selectAllMemberList");
		return memberList;
	}

	
	
	@Override
	public void addMember(MemberVO memberVO) throws DataAccessException {
		
		 sqlSession.insert("mapper.member.insertMember", memberVO);

	}
	
	

}
