# SocialMedia-backend-replica
Architected robust backend functionality for the Instagram clone

Overview:
The "Social Media Backend Replica" project is a robust Spring Boot application designed to efficiently manage user data. 
It offers API endpoints for operations like login, signup with mail integration, post addition, and deletion, implementing CRUD operations and specified validations. 
MySQL is used as the database for simplicity.

Technologies Used:
Java , Spring Boot, Spring Web Initializer, Maven, Spring Web Dependency 

Key Features of Models:
1. User Model:
   - Attributes: firstName, lastName, age, email, phoneNumber.
   - Used for authentication during sign-in and sign-up; the received token is utilized for user operations.
2. Post Model:
   - Attributes: postId, postContent, postCaption, createDate, updateDate, postType.
   - Used to manage post data, with ownership mapped to the User model.
3. Authentication Token Model:
   - Attributes: tokenId, tokenValue, tokenCreationDateTime.
   - Used for token-based authentication, with a one-to-one mapping to the User model.

Usage:
Access the application at http://localhost:8080 and use the provided API endpoints for User Management.

Controller:
The APIController class controls the data flow, utilizing annotations like @RestController for controller layer functionality, and CRUD operations are performed using annotations like @PostMapping, @GetMapping, @PutMapping, @DeleteMapping.

Endpoint API Reference:
PostController:
   - Endpoints: POST, GET, GET, PUT, DELETE.
   - Implements signin with mail integration using token-based authentication.

Contact:
For questions or feedback, please contact Varshini S via email at varshini.18shankar19@gmail.com
