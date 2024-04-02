package com.example.petstoreapp.Dtos;

import lombok.Data;

@Data
public class ChangePasswordDto {

      private String old_password;
      private String new_password;
      private String confirm_new_password;
    
}
