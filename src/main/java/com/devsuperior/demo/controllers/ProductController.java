package com.devsuperior.demo.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.Departament;

@RestController
@RequestMapping(value = "/products")

public class ProductController{

    public Departament getObjects(){

        Departament d1 = new Departament();
        d1.setId();
        d1.setName("Tech");

        return d1;


    }

}