package com.example.petstoreapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petstoreapp.Endities.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,Integer>{

    
}