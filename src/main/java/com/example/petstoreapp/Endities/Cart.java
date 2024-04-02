package com.example.petstoreapp.Endities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer cart_number;
    private Integer product_id;
    private Integer user_id;
    private Integer count;
    private Integer total_price;    
    
}
