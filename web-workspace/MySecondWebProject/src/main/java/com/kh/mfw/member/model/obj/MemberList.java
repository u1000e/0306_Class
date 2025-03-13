package com.kh.mfw.member.model.obj;

import java.util.List;

import com.kh.mfw.member.model.dto.MemberDTO;

public class MemberList {
	
	{
		List<MemberDTO> list;
	}
	
	MemberDTO[] members = new MemberDTO[10];
	
	public void add(MemberDTO member, int n) {
		members[n] = member;
	}
	
	public MemberDTO get(int index) {
		return members[index];
	}

}
