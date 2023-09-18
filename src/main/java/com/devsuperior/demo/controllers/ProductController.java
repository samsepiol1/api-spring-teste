package com.devsuperior.demo.controllers;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")

public class ProductController{

    @GetMapping

    public List<Product> getObjects(){
        Department d1 = new Department(1L, "Tech");
        Department d2 = new Department(2L, "Pet");


     
        Product p1 = new Product(3L, "nome2", null, d1);
        Product p2 = new Product(4L, "nome", null, d2);

        List<Product> list = Arrays.asList(p1,p2);
        
        return list;
        
      
        

    }

}