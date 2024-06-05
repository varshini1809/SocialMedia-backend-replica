# <h1 align = "center"> Instagram Backedn Clone </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview 🪟
<p align="center">This project, named "Instagram Backedn Clone" is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allows  you to manage login, signup with mail integration , add post, deletepost and etc, perform CRUD operations, and apply the specified validations. The application will use MySQL as the database for simplicity and we have use validation.
</p>

<!-- Table of Contents -->
## Table of Contents📑
1. [Technologies Used](#technologies-used)
2. [Models Key Feautures](#models-key-features🔑)
3. [Usage](#usage)
4. [Controller](#controller🎮)
5. [Endpoint API reference](#endpoint-api-reference)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used🧑‍💻
- Java 21
- Spring Boot
- Spring Web Initializer
- Maven 
- Spring Web Dependency  { Spring web, Lombok, Validation, MySQL, Spring JPA}


<!-- Model --->

## Models Key Features🔑
### 1 -> User Model
    Attribute's   - used authentication in here during sign in and sign up and use the token received for all user operatio
       -> private String firstName;
       -> private String lastName;
       -> private Integer age;
       -> private String email;
       -> private String phoneNumber;


### 2 -> Post Model
    Attributes's
      -> private Integer postId;
      -> private String postContent;
      -> private String postCaption;
      -> private Timestamp createDate;
      -> private Timestamp updateDate;
     @Enumerated(value = EnumType.STRING)
      -> private PostType postType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_owner_user_id")
     -> private User postOwner;

### 3 -> Authentication Token Model
    Attribute's  
       -> private Long tokenId;
       -> private String tokenValue;
       -> private LocalDateTime tokenCreationDateTime;

    //mapping
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "fk_user_Id")
       ->  User user;

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to manage your User Management.

### Controller🎮:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### Endpoint API Reference :

#### PostController :
     Endpoints:
         -> POST
         -> GET
         -> GET 
         -> PUT
         -> DELETE

        signin with mail integration token based
         

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact📲
For questions or feedback, please contact : Avadhesh Shukla👍
- Maild Id 📧: avadheshsukla1636@gmail.com

<h1 align="center">Thank You💖...<h1>
<h3 align = "center"> ***********************************************************<h3>




 
