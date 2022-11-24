package com.lg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lg.dao.MemberDAO;
import com.lg.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDao;

	@Override
	public MemberDTO getMember(String id) throws Exception {	
		return memberDao.getMember(id);
	}

	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}
	
}
