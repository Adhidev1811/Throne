package com.example.petstoreapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.petstoreapp.Dtos.AddPetDto;
import com.example.petstoreapp.Endities.Pet;
import com.example.petstoreapp.Services.PetService;



@RestController
public class PetController {

    @Autowired
    private PetService ps;

    @RequestMapping(path="/pet", method=RequestMethod.POST)
    public Pet Ap(@RequestBody AddPetDto p)
    {
        return this.ps.addPet(p);
    }
           
}