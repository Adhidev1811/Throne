package com.example.petstoreapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstoreapp.Endities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>{

    
}