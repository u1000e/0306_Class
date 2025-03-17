package com.kh.mfw.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mfw.member.model.dto.MemberDTO;

public class MemberDAO {
	
	public MemberDTO login(SqlSession sqlSession, MemberDTO member) {
		/*
		 * MemberDTO loginMember = null;
		 * PreparedSTatement pstmt = null;
		 * ResultSet rset = null;
		 * 
		 * String sql = "SELECT MEMBER_ID, MEMBER_PW.. 
		 * FROM KH_MEMBER ORDER BY "
		 * 
		 * try {
		 * 	  pstmt = sqlSession.preparedStatement(sql);
		 * 
		 * 	  pstmt.setString(1, member.getMemberId());
		 * 	  pstmt.setString(2, member.getMemberPw());
		 * 
		 *    rset = pstmt.executeQuery();
		 *    
		 *    if(rset.next()){
		 *       loginMember = new MemberDTO();
		 *       loginMember.setMemberId(rset.getString("MEMBER_ID");
		 *       loginMember.setMemberPw(rset.getString("Member_PW");
		 *    	 ...
		 *    }
		 * } catch(SQLException e){
		 * 		e.printStackTrace();
		 * } finally{
		 *  자우넌바뉴ㅗ ㄹㅇㅎ ㅑㅐㅓㅇㄹ헤ㅐ ㅑㅏㄷㅅ ㅔ09ㅇ 랴8ㅐ호
		 * }
		 * 
		 * return loginMember;
		 */
		
		// SqlSession이 제공하는 메소드를 통해 SQL문을 찾아서 실행하고 결과를 받을 수 있음
		// sqlSession.sql문종류에맞는메소드("mapper파일의namspace.SQL문의id속성값");
		//MemberDTO loginMember = sqlSession.selectOne("memberMapper.login", member);
		//System.out.println(loginMember.toString());
		return sqlSession.selectOne("memberMapper.login", member);
	}
	
	
	public boolean checkId(SqlSession sqlSession, String memberId) {
		/*
		int result = sqlSession.selectOne("memberMapper.checkId", memberId);
		
		if(result > 0) {
			return true;
		} else {
			return false;
		}
		*/
		return (Integer)sqlSession.selectOne("memberMapper.checkId", memberId) > 0 ? true : false;
	}
	
	public int signUp(SqlSession sqlSession, MemberDTO member) {
		return sqlSession.insert("memberMapper.signUp", member);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}