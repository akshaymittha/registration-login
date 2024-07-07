package com.example.service;


import com.example.dto.UserRegistrationDto;
import com.example.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
