package com.example.petstoreapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petstoreapp.Dtos.AddPetDto;
import com.example.petstoreapp.Endities.Pet;
import com.example.petstoreapp.Repositories.PetRepository;

@Service
public class PetService {

    @Autowired
    private PetRepository rs;

    public Pet addPet(AddPetDto adto)
    {
        Pet p=new Pet();

        p.setPet_name(adto.getPet_name());
        p.setPet_description(adto.getPet_description());
        p.setPet_category(adto.getPet_category());
        p.setPet_status(adto.getPet_status());

        rs.save(p);

        return p;

    }

    
}
