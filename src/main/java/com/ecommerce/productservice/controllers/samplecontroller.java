package com.ecommerce.productservice.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // defines http
@RequestMapping("/say")// we are mapping website
public class samplecontroller {
    @GetMapping("/hello/{name}")// we are mapping function
    public String hello(@PathVariable String name)// defining the name of function and how to use the values provided
    {
        return "hello " + name;
    }
    @GetMapping("/bye")
    public String bye()
    {
        return "bye";
    }
}
