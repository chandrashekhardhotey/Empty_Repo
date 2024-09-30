package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "home")
public class UserResource {
    @GetMapping(value = "/")
    public String homePage(){
        return "Home Page";
    }
}
