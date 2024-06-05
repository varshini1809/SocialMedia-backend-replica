package com.instaBackend.Repo;

import com.instaBackend.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
