package com.kh.app.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("list")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService ms;
	
	@GetMapping
	public void listPage() {}
}
