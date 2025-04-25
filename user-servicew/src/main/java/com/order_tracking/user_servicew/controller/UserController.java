package com.order_tracking.user_servicew.controller;


import com.order_tracking.user_servicew.entities.User;
import com.order_tracking.user_servicew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getUsername(), user.getPassword());
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable  String username) {
        return ResponseEntity.ok(userService.getUser(username));
    }
}
