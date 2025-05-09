package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
   @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id)
   {
       return null ;
   }
   public List<Product> getAllProducts()
   {
       return new ArrayList<>();
   }
}
