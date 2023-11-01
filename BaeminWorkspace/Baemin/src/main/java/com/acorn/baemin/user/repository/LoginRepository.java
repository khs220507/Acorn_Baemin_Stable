package com.acorn.baemin.user.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.UserDTO;

@Repository
public class LoginRepository implements LoginRepositoryI {

	@Autowired
	private SqlSession session;

	@Autowired
	private static String namespace = "com.acorn.LoginMapper.";

	// 판매자 홈
	@Override
	public String sellerHome() {
		// TODO Auto-generated method stub
		return null;
	}

	// 판매자 회원가입
	@Override
	public String sellerSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	// 판매자 로그인
	@Override
	public String sellerLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	// 판매자 정보수정
	@Override
	public String sellerModify() {
		// TODO Auto-generated method stub
		return null;
	}

	// 전체조회
	@Override
	public List<UserDTO> selectAll() throws Exception {
		System.out.println("good");
		return session.selectList(namespace + "selectAll");
	}

	// 로그인 여부 확인
	@Override
	public boolean loginCustomer(String unputId, String inputPw) {
		return true;
	}

	// 소비자 로그인
	@Override
	public String customerlogin() {
		// TODO Auto-generated method stub
		return null;
	}

	// 홈
	@Override
	public String home() {
		// TODO Auto-generated method stub
		return null;
	}

	// 가입 유형 선택
	@Override
	public String selectSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	// 소비자 가입
	@Override
	public String customerSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	// 소비자 홈
	@Override
	public String customerHome() {
		// TODO Auto-generated method stub
		return null;
	}

	// 로그아웃
	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return null;
	}

	// 소비자 정보 수정
	@Override
	public String customerModify() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public UserDTO login(String userId, String userPw) {
		UserDTO user = new UserDTO();
		user.setUserId(userId);
		user.setUserPw(userPw);
		session.selectOne(namespace + "selectUserById"  , user );
		return null;
	}

}
