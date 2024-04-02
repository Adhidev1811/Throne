package com.example.petstoreapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.petstoreapp.Dtos.RegisterUserDto;
import com.example.petstoreapp.Endities.User;
import com.example.petstoreapp.Services.UserService;



@RestController
public class UserController {

    @Autowired
    private UserService ps;

    @RequestMapping(path="/user", method=RequestMethod.POST)
    public User Ap(@RequestBody RegisterUserDto p)
    {
        return this.ps.registeruser(p);
    }
           
}