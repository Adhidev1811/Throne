package com.example.petstoreapp.Endities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String pet_name;
    private String pet_description;
    private String pet_category;
    private String pet_status;
    private Integer user_id;
    
}
