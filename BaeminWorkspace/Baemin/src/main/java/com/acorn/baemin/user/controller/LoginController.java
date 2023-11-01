package com.acorn.baemin.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.baemin.domain.UserDTO;
import com.acorn.baemin.user.repository.LoginRepositoryI;
import com.acorn.baemin.user.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginRepositoryI rep;

	@Autowired
	private LoginService loginService;	

	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@PostMapping("/login")
	public String processLogin(String userId, String userPw, Model model) {
		
		UserDTO user = loginService.login(userId, userPw);
		
		if (user != null) {
			return "redirect:/userProfile"; 		 
		} else {
			model.addAttribute("message", "로그인 실패. 아이디와 비밀번호를 확인해주세요.");
			return "user/login";
		}
	}


	@GetMapping("/customer_signup")
	public String customer_signup() {
		return "user/customer_signup";
	}

	@GetMapping("/seller_signup")
	public String seller_signup() {
		return "user/seller_signup";
	}

	@GetMapping("/select_signup")
	public String select_signup() {
		return "user/select_signup";
	}

	@GetMapping("/customer_modify")
	public String customer_modify() {
		return "user/customer_modify";
	}

	@RequestMapping("/selectAll")
	public String main(Model model) {
		List<UserDTO> result;
		try {
			result = rep.selectAll();
			model.addAttribute("list", result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "user/login";

	}
}
