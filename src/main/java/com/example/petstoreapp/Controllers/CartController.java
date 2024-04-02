package com.example.petstoreapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.petstoreapp.Dtos.CreateCartDto;
import com.example.petstoreapp.Endities.Cart;
import com.example.petstoreapp.Services.CartService;



@RestController
public class CartController {

    @Autowired
    private CartService ps;

    @RequestMapping(path="/cart", method=RequestMethod.POST)
    public Cart Ap(@RequestBody CreateCartDto p)
    {
        return this.ps.addCart(p);
    }
           
}