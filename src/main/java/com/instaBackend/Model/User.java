package com.instaBackend.Model;

import com.instaBackend.Model.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String firstName;
    private String lastName;
    private Integer age;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private String email;
    private String password;
    private String phoneNumber;

}
