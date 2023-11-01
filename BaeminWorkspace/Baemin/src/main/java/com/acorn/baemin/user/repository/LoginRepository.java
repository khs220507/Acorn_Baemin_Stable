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

	// �Ǹ��� Ȩ
	@Override
	public String sellerHome() {
		// TODO Auto-generated method stub
		return null;
	}

	// �Ǹ��� ȸ������
	@Override
	public String sellerSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	// �Ǹ��� �α���
	@Override
	public String sellerLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	// �Ǹ��� ��������
	@Override
	public String sellerModify() {
		// TODO Auto-generated method stub
		return null;
	}

	// ��ü��ȸ
	@Override
	public List<UserDTO> selectAll() throws Exception {
		System.out.println("good");
		return session.selectList(namespace + "selectAll");
	}

	// �α��� ���� Ȯ��
	@Override
	public boolean loginCustomer(String unputId, String inputPw) {
		return true;
	}

	// �Һ��� �α���
	@Override
	public String customerlogin() {
		// TODO Auto-generated method stub
		return null;
	}

	// Ȩ
	@Override
	public String home() {
		// TODO Auto-generated method stub
		return null;
	}

	// ���� ���� ����
	@Override
	public String selectSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	// �Һ��� ����
	@Override
	public String customerSignup() {
		// TODO Auto-generated method stub
		return null;
	}

	// �Һ��� Ȩ
	@Override
	public String customerHome() {
		// TODO Auto-generated method stub
		return null;
	}

	// �α׾ƿ�
	@Override
	public String logout() {
		// TODO Auto-generated method stub
		return null;
	}

	// �Һ��� ���� ����
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
