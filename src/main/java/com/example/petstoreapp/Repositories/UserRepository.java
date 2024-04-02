package com.example.petstoreapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstoreapp.Endities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    
}