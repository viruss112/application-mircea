package com.example.demo.Services;

import com.example.demo.DTOs.LoginDTO;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginDTO login(String email) {

        User user = userRepository.getUserByEmail(email);
        LoginDTO loginDTO = new LoginDTO();


        if (user != null) {
            loginDTO.setUserExistent(true);
        } else {
            loginDTO.setError("User does not exist!");
        }

        return loginDTO;
    }
}
