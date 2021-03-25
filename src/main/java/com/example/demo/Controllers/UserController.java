package com.example.demo.Controllers;

import com.example.demo.DTOs.LoginDTO;
import com.example.demo.DTOs.UserDTO;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/get-user")
    public LoginDTO login(@RequestBody UserDTO userDTO) {
        return userService.login(userDTO.getUsername());
    }
}
