package com.kh.app.member.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

	private final SqlSessionTemplate sst;
	private final MemberDao dao;

	//학원생 등록 하기
	public int insertMember(MemberVo vo) {
		return dao.insertMember(sst,vo);
	}

	//모든 학생 조회
	public List<MemberVo> selelctAllMember(Map<String, String> paramMap) {
		return dao.selectAllMember(sst, paramMap);
	}

	//한명의 학생 조회
	public MemberVo selectOneMember(MemberVo vo) {
		return dao.selectOneMember(sst,vo);
	}

	//학생 삭제
	public int deleteMember(MemberVo vo) {
		return dao.deleteMember(sst,vo);
	}

	//학생 정보 수정
	public int editMember(MemberVo vo) {
		return dao.editMember(sst,vo);
	}
	
	
}
