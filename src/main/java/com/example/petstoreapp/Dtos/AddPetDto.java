package com.example.petstoreapp.Dtos;

import lombok.Data;

@Data
public class AddPetDto {

      private String pet_name;
      private String pet_description;
      private String pet_category;
      private String pet_status;
    
}
