package com.coder.jdbcpractice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    UserDataAccessService userDataAccessService;

    public User registerUser(User user) {

        return userDataAccessService.saveUserDetails(user);
    }

}
