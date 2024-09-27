package com.develhope.deploy1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class Controller {
    @GetMapping("/devName")
    public String devName(){
        return "Iresha";
    }
}
