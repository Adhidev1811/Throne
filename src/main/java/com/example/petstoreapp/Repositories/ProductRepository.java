package com.example.petstoreapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstoreapp.Endities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

    
}