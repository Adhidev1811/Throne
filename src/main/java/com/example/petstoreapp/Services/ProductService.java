package com.example.petstoreapp.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petstoreapp.Dtos.AddProductDto;
import com.example.petstoreapp.Endities.Product;
import com.example.petstoreapp.Repositories.ProductRepository;
import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository rs;

    public Product addProducts(AddProductDto adto)
    {
        Product p=new Product();

        p.setProduct_name(adto.getProduct_name());
        p.setManufacurer(adto.getManufacurer());
        p.setDescription(adto.getDescription());
        p.setPrice(adto.getPrice());
        p.setMdate(adto.getMdate());

        rs.save(p);

        return p;

    }

    public List<Product> getAll()
    {
        return rs.findAll();//select * from products;
    }
    
    public Product getId(Integer id)
    {
        return rs.findById(id).orElse(null);//select * from products;
    }
    public Product updateUser(Integer id, Product u){
        u.setId(id);
        return rs.save(u);
    }
    
}
    
