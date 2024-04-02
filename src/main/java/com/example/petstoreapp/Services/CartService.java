package com.example.petstoreapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petstoreapp.Dtos.CreateCartDto;
import com.example.petstoreapp.Endities.Cart;
import com.example.petstoreapp.Repositories.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository rs;

    public Cart addCart(CreateCartDto adto)
    {
        Cart p=new Cart();

       p.setProduct_id(adto.getProduct_id());
       p.setId(adto.getUser_id());
       p.setCount(adto.getCount());
       p.setTotal_price(adto.getCount());

        rs.save(p);

        return p;

    }

    
}
