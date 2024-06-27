package com.example.userdemo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void getInfo() {
        System.out.println("User info: Aditya Gupta, Age: 22");
    }
}
