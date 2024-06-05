package com.instaBackend.Repo;

import com.instaBackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {


    User findFirstByEmail(String newEmail);
}
