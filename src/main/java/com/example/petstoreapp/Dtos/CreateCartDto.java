package com.example.petstoreapp.Dtos;

import lombok.Data;

@Data
public class CreateCartDto {

      private Integer product_id;
      private Integer user_id;
      private Integer count;
      private Double price;
      public Object getDescription() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
      }
    
}
