package com.example.petstoreapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.petstoreapp.Dtos.AddCategoryDto;
import com.example.petstoreapp.Endities.Category;
import com.example.petstoreapp.Services.CategoryService;



@RestController
public class CategoryController {

    @Autowired
    private CategoryService ps;

    @RequestMapping(path="/category", method=RequestMethod.POST)
    public Category Ap(@RequestBody AddCategoryDto p)
    {
        return this.ps.addCategory(p);
    }
           
}