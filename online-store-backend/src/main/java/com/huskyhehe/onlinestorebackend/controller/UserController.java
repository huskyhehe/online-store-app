package com.huskyhehe.onlinestorebackend.controller;

import com.huskyhehe.onlinestorebackend.model.Role;
import com.huskyhehe.onlinestorebackend.security.UserPrinciple;
import com.huskyhehe.onlinestorebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")  // pre-path
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("change/{role}")      // api/user/change/{role}
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrinciple userPrinciple, @PathVariable Role role) {
        userService.changeRole(userPrinciple.getUsername(), role);
        return ResponseEntity.ok(true);
    }

}
