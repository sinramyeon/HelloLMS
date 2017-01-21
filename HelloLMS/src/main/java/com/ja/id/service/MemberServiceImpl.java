package com.ja.id.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ja.id.dao.MemberDAO;
import com.ja.id.domain.MemberVO;
import com.ja.id.dto.LoginDTO;

@Component
@Transactional(readOnly = true)
@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO MemberDAO;
	

	@Override
	public MemberVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return MemberDAO.login(dto);
	}


	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
		MemberDAO.insertMember(vo);
		
	}

}
