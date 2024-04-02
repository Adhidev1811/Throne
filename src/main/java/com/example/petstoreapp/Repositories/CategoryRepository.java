package com.example.petstoreapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstoreapp.Endities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

    
}