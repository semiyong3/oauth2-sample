package com.lucern.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lucern.domain.Member;

@Controller
@RequestMapping("/member")
public class MemberController {
	/*
	 * @Autowired MemberService memberService;
	 * 
	 * @RequestMapping public List<Member> all() { return memberService.findAll(); }
	 * 
	 * @RequestMapping("/{id}") public Member get(@PathVariable("id") Long id) {
	 * return memberService.find(id); }
	 */}
