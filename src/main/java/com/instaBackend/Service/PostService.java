package com.instaBackend.Service;

import com.instaBackend.Model.Post;
import com.instaBackend.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public Optional<Post> getPost(Integer id) {
        return postRepo.findById(id);
    }


    public String addPost(String email, String tokenVal, Post newPost) {
        postRepo.save(newPost);
        return "Post Uploaded Successfully!!";
    }

    public String deleteInstaPost(String email, String tokenValue, Integer postId) {
        postRepo.deleteById(postId);
        return " Post Deleted Successfully!!";
    }
}
