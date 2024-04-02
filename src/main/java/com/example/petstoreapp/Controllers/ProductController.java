package com.example.petstoreapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.petstoreapp.Dtos.AddProductDto;
import com.example.petstoreapp.Endities.Product;
import com.example.petstoreapp.Services.ProductService;



@RestController
public class ProductController {

    @Autowired
    private ProductService ps;

    @RequestMapping(path="/products", method=RequestMethod.POST)
    public Product Ap(@RequestBody AddProductDto p)
    {
        return this.ps.addProducts(p);
    }

    @RequestMapping(path="/getproducts", method = RequestMethod.GET)
    public Iterable<Product> getss()
    {
        return this.ps.getAll();
    }
    @RequestMapping(path="/getbyId/{id}",method=RequestMethod.GET)
    public Product getIds(@PathVariable Integer id)
    {
        return this.ps.getId(id);
    }
    @PutMapping("/users/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody Product u){
        Product userExists = this.ps.getId(id);
        if(userExists != null){
            return new ResponseEntity<>(this.ps.updateUser(id, u), HttpStatus.OK);
        }
        else   
            return new ResponseEntity<>("Product Does Not Exists", HttpStatus.NOT_FOUND);
    }

           
}