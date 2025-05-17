package com.gomocodes.CRUD.controller;

import com.gomocodes.CRUD.entity.Students;
import com.gomocodes.CRUD.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {

    private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

    @Autowired
    private UsersService usersService;

    @GetMapping("/users") // http://localhost:8080/api/users
    public ResponseEntity<List<Students>> getAllUsers() {
        logger.info("Fetching all users request from client ");
        List<Students> users = usersService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{id}") // http://localhost:8080/api/users/2
    public ResponseEntity<Students> getUsersByID(@PathVariable Long id) {
        logger.info("Fetching user with ID: {}", id);
        Students user = usersService.getUsersByID(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Students> createUsers(@RequestBody Students students) {

        Students createdUser = usersService.createUsers(students);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Students> updateUsers(@PathVariable Long id, @RequestBody Students userDetails) {
        Students updatedUser = usersService.updateUser(id, userDetails);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        logger.info("Deleting user with ID: {}", id);
        usersService.deleteUsersByID(id);
        return ResponseEntity.ok("User deleted with id: " + id);
    }

}





