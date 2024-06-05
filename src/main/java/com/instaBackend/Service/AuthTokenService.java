package com.instaBackend.Service;

import com.instaBackend.Model.AuthToken;
import com.instaBackend.Repo.AuthTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthTokenService {

    @Autowired
    AuthTokenRepo authTokenRepo;

    public void createToken(AuthToken token) {
        authTokenRepo.save(token);
    }
}
