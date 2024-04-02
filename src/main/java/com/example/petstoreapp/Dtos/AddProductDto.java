package com.example.petstoreapp.Dtos;


import lombok.Data;

@Data
public class AddProductDto {

      private String product_name;

    private String manufacurer;
    private String description;
    private String mdate;
    private Double price;
    
}
