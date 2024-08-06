package com.ecommerce.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    public int id;
    private String name;
    private String description;
    private int price;


}
