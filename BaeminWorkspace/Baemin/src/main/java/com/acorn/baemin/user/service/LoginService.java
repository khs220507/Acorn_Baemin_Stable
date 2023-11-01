package com.acorn.baemin.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.acorn.baemin.domain.UserDTO;
import com.acorn.baemin.user.repository.LoginRepositoryI;

@Service
public class LoginService {

    @Autowired
    private LoginRepositoryI loginRepositoryi;

    public UserDTO login(String userId, String userPw) {
        try {
            return loginRepositoryi.login(userId, userPw);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
