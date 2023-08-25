package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class MemberDAO {

	
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int join(MemberDTO dto) {

		SqlSession session =  sqlSessionFactory.openSession(true);
		
		int cnt = session.insert("join", dto);
		
		session.close();
		
		return cnt;
	}

	public MemberDTO login(MemberDTO dto) {

		SqlSession session =  sqlSessionFactory.openSession(true);
		
		MemberDTO info = session.selectOne("login", dto);
		
		session.close();
		
		return info;
	}
	
	
	
}
