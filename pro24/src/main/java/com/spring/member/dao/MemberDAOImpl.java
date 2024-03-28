package com.spring.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;

public class MemberDAOImpl  implements MemberDAO{

	
	
	private SqlSession sqlSession;
	
	
	
	
	
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}






	@Override
	public List<MemberVO> listMembers() throws DataAccessException {
		 List<MemberVO> memberList=sqlSession.selectList("mapper.member.selectAllMemberList");
	
		
		
		return memberList;
	}

	

}
