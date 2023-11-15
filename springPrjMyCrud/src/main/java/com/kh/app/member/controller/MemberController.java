package com.kh.app.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

	private final MemberService ms;
	
	//리스트 화면 보여주기
	@GetMapping("list")
	public void listPage(MemberVo vo, Model m ,@RequestParam Map<String, String> paramMap) {
	
		List<MemberVo> memberList = ms.selelctAllMember(paramMap);
		
		if(memberList ==null) {
			throw new RuntimeException();
		}
		
		m.addAttribute("memberList", memberList);
		m.addAttribute("paramMap", paramMap);
	}

	// 학원생 등록하기
	@PostMapping("insert")
	@ResponseBody
	public int insertMember(MemberVo vo) {
		
		int result = ms.insertMember(vo);
		
		if(result != 2) {
			throw new RuntimeException();
		}
		
		return result;
	}
	
	//한명의 회원 조회
	@PostMapping("select")
	@ResponseBody
	public String selectOneMember(MemberVo vo, Model m) {
		
		MemberVo memberVo = ms.selectOneMember(vo);
		
		if(memberVo ==null) {
			throw new RuntimeException();
		}
		
		Gson gson = new Gson();
		String str = gson.toJson(memberVo);
		
		return str;
		
	}
	
	//학생 삭제
	@PostMapping("delete")
	@ResponseBody
	public int deleteMember(MemberVo vo) {
		
		int result = ms.deleteMember(vo);
		
		if(result !=1) {
			throw new RuntimeException();
		}
		
		return result;
		
	}
	
	//학생 정보 수정
	@PostMapping("edit")
	@ResponseBody
	public int editMember(MemberVo vo) {
		
		int result = ms.editMember(vo);
		
		if(result != 1) {
			throw new RuntimeException();
		}
		
		return result;
	}
	






}

