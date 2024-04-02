package com.example.petstoreapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petstoreapp.Dtos.RegisterUserDto;
import com.example.petstoreapp.Endities.User;
import com.example.petstoreapp.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository rs;

    public User registeruser(RegisterUserDto adto)
    {
        User p=new User();

        p.setFirst_name(adto.getFirst_name());
        p.setLast_name(adto.getLast_name());
        p.setEmail(adto.getEmail());
        p.setPassword(adto.getPassword());
        p.setMobile(adto.getMobile());

        rs.save(p);

        return p;

    }

    
}
