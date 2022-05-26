package com.huskyhehe.onlinestorebackend.service;

import com.huskyhehe.onlinestorebackend.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
