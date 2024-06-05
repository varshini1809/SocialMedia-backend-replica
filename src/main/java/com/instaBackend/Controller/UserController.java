package com.instaBackend.Controller;

import com.instaBackend.Model.User;
import com.instaBackend.Service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService  userService;



    @PostMapping("/SignUp")
    public String userSignUp(@RequestBody User user){
        return userService.userSignUp(user);
    }

    @PostMapping("/SignIn")
    public String signIn(@RequestParam String email, @RequestParam String password){
        return userService.signIn(email, password);
    }

//    @DeleteMapping("/signOut")
//        public String signOut(@RequestParam String email, @RequestParam String tokenVal){
//            return userService.signOut(email, tokenVal);
//    }

    @PutMapping("/userName/id/{id}")
    public String updateUserName(@PathVariable  Integer id, @RequestParam  String firstName){
        return userService.updateUserName(id, firstName);
    }
}
