package com.junefw.infra.modules.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberServiceImpl service;

	@RequestMapping(value = "/member/memberForm")
	public String memberForm(Model model) throws Exception {

		return "member/memberForm";
	}

	@RequestMapping(value = "/member/memberInst")
	public String memberInst(Model model, Member dto) throws Exception {

		System.out.println("dto.getIfmmId(): " + dto.getIfmmId());
		System.out.println("dto.getIfmmName(): " + dto.getIfmmName());

		// 입력을 작동시킨다.
		int result = service.insert(dto);

		System.out.println("result: " + result);

		return "";
	}
}