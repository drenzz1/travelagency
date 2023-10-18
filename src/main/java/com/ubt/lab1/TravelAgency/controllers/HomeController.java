package com.ubt.lab1.TravelAgency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String andi(){
        return "<h1>home</h1>";
    }

}
