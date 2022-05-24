package com.huskyhehe.onlinestorebackend.service;

import com.huskyhehe.onlinestorebackend.model.Role;
import com.huskyhehe.onlinestorebackend.model.User;
import com.huskyhehe.onlinestorebackend.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User saveUser(User user) {

//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        user.setRole(Role.USER);
//        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

}
