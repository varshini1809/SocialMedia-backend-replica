package com.instaBackend.Repo;


import com.instaBackend.Model.AuthToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthTokenRepo extends JpaRepository<AuthToken, Long> {
}
