package com.instaBackend.Controller;

import com.instaBackend.Model.Post;
import com.instaBackend.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/post")
    public String addPost(@RequestParam String email, @RequestParam String tokenVal,@RequestBody Post newPost){
        return postService.addPost(email, tokenVal, newPost);
    }

    @GetMapping("/posts")
    public Optional<Post> getPost(@RequestParam Integer id){
        return postService.getPost(id);
    }

    @DeleteMapping("InstaPost/{postId}")
    public String deleteInstaPost(@RequestParam String email, @RequestParam String tokenValue, @PathVariable Integer postId)
    {
        return postService.deleteInstaPost(email,tokenValue,postId);
    }


}
