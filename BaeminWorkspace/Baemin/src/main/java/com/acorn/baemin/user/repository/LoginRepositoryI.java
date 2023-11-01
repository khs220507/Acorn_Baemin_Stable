package com.acorn.baemin.user.repository;

import java.util.List;

import com.acorn.baemin.domain.UserDTO;

public interface LoginRepositoryI {

	// 홈(사장님)
	public String sellerHome();

	// 회원가입(사장님)
	public String sellerSignup();

	// 로그인(사장님)
	public String sellerLogin();

	// 내정보수정(사장님)
	public String sellerModify();
	
	public List<UserDTO> selectAll() throws Exception;

	public boolean loginCustomer(String unputId, String inputPw) throws Exception;

	// 로그인
	public String customerlogin();

	// 홈
	public String home();

	// 가입 선택
	public String selectSignup();

	// 회원가입(고객)
	public String customerSignup();

	// 고객홈(로그인 후)
	public String customerHome();

	// 로그아웃
	public String logout();

	// 내정보수정(고객)
	public String customerModify();

	UserDTO login(String userId, String userPw);

	
}
