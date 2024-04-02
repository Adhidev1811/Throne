package com.example.petstoreapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petstoreapp.Dtos.AddCategoryDto;
import com.example.petstoreapp.Endities.Category;
import com.example.petstoreapp.Repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository rs;

    public Category addCategory(AddCategoryDto adto)
    {
        Category p=new Category();

       p.setCategory_name(adto.getCategory_name());
       p.setDescription(adto.getCount());

        rs.save(p);

        return p;

    }

}    

    