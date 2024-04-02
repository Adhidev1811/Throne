package com.example.petstoreapp.Dtos;

import lombok.Data;

@Data
public class UpdateCartDto {

      private Integer product_id;
      private Integer user_id;
      private Integer count;
      private Double price;
    
}
