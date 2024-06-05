package com.instaBackend.Service;


import com.instaBackend.Model.AuthToken;
import com.instaBackend.Model.User;
import com.instaBackend.Repo.UserRepo;
import com.instaBackend.Service.Email.EmailHandler;
import com.instaBackend.Service.Password_Hashing.PasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    AuthTokenService authTokenService;

    public String userSignUp(User user) {

        String newEmail = user.getEmail();

        User existingUser = userRepo.findFirstByEmail(newEmail);
        if(existingUser != null){ return user.getEmail() + "  Already Registered!!"; }

            String signUpPassword = user.getPassword();

            try {
                String encryptedPassword = PasswordEncryptor.encrypt(signUpPassword);

                user.setPassword(encryptedPassword);

                userRepo.save(user);
                return user.getFirstName() + "   Registered Successfully!!";

            } catch (NoSuchAlgorithmException e) {

                return "Internal Server issues while saving password, try again later!!!";
            }
    }


    public String signIn(String email, String password) {
        User existingUser = userRepo.findFirstByEmail(email);

        if(existingUser == null)
        {
            return "Not a valid email, Please sign up first !!!";
        }

        //password should be matched

        try {
            String encryptedPassword = PasswordEncryptor.encrypt(password);

            if(existingUser.getPassword().equals(encryptedPassword))
            {
                // return a token for this sign in
                AuthToken token  = new AuthToken(existingUser);

                if(EmailHandler.sendEmail(email,"otp after login", token.getTokenValue())) {
                    authTokenService.createToken(token);
                    return  "OTP Sent on Successfully !!!";
                }
                else {
                    return "error while generating token!!!";
                }

            }
            else {
                //password was wrong!!!
                return "Invalid Credentials!!!";
            }

        } catch (NoSuchAlgorithmException e) {

            return "Internal Server issues while saving password, try again later!!!";
        }

    }

    public String updateUserName(Integer id, String firstName) {
        User UserUpdate = userRepo.findById(id).orElse(null);
        if (UserUpdate != null) {
            UserUpdate.setFirstName(firstName);
            userRepo.save(UserUpdate);
            return "Wohoo!! User updated successfully";
        }
        return "User not found !!";
    }
}
