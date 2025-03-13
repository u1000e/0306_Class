package com.kh.mfw.member.model.service;

import com.kh.mfw.member.model.dao.MemberDAO;
import com.kh.mfw.member.model.dto.MemberDTO;

public class MemberService {
	
	public MemberDTO login(MemberDTO member) {
		/*
		로그인을하는건데
		로그인이라 함은
		DB에가서 SELECT절에다가 사용자가 입력한 아이디값과 비밀번호값을 조건절에 사용해서 조회를 하는 절차를 의미
		
		ID가 틀리거나 PW가 틀려서 로그인에 실패할 수 있는 가능성이 있음
		
		member.getMemberId().length() > 10
						Pw
							!.matches("/^[A-Za-z0-1)/")
		member.getMemberId().equals("")
						Pw
		DB에 갈필요가 없는거아님?
		서비스단에서 유효성검사하기(Validation)
    	*/
		MemberDTO loginMember = new MemberDAO().login(member);
		return loginMember;
	}
	
	
	
	
	
	
	
	
	
	

}
