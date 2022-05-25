package com.huskyhehe.onlinestorebackend.service;

import com.huskyhehe.onlinestorebackend.model.Role;
import com.huskyhehe.onlinestorebackend.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);
    Optional<User> findByUsername(String username);
    void changeRole(String username, Role newRole);

}
