package com.lg.dao;

import java.util.List;

import com.lg.dto.MemberDTO;

public interface MemberDAO {

	List<MemberDTO> memberList() throws Exception;
	public MemberDTO getMember(String id) throws Exception;

}
