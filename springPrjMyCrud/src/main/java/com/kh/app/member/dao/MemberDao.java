package com.kh.app.member.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.member.vo.MemberVo;

@Repository
public class MemberDao {

	//학원생 등록하기
	public int insertMember(SqlSessionTemplate sst, MemberVo vo) {
		return sst.insert("member.insertMember", vo);
	}

	//모든 학생 조회
	public List<MemberVo> selectAllMember(SqlSessionTemplate sst, Map<String, String> paramMap) {
		return sst.selectList("member.selectAllMember", paramMap);
	}

	//한명의 학생 조회
	public MemberVo selectOneMember(SqlSessionTemplate sst, MemberVo vo) {
		return sst.selectOne("member.selectOneMember", vo);
	}

	//학생 삭제
	public int deleteMember(SqlSessionTemplate sst, MemberVo vo) {
		return sst.delete("member.deleteMember", vo);
	}

	//학생 정보 수정
	public int editMember(SqlSessionTemplate sst, MemberVo vo) {
		return sst.update("member.editMember",vo);
	}

}
