package com.example.petstoreapp.Dtos;

import lombok.Data;

@Data
public class RegisterUserDto {

      private String first_name;
      private String last_name;
      private String email;
      private String password;
      private String confirm_password;
      private String mobile;
    
}
