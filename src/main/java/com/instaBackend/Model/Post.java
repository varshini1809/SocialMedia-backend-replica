package com.instaBackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.instaBackend.Model.Enum.PostType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private String postContent;
    private String postCaption;
    private Timestamp createDate;
    private Timestamp updateDate;
    @Enumerated(value = EnumType.STRING)
    private PostType postType;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_owner_user_id")
    private User postOwner;

}
