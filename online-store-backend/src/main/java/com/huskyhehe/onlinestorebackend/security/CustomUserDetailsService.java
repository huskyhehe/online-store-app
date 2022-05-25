package com.huskyhehe.onlinestorebackend.security;

import com.huskyhehe.onlinestorebackend.model.User;
import com.huskyhehe.onlinestorebackend.service.UserService;
import com.huskyhehe.onlinestorebackend.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Set;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));
        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));

        // user details
        return UserPrinciple.builder()
                .user(user)
                .id(user.getId())
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }

}