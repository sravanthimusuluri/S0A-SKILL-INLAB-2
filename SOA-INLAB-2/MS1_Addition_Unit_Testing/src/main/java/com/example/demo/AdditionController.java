package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    private final AdditionService service;

    @Autowired
    public AdditionController(AdditionService service) {
        this.service = service;
    }

    @GetMapping("/ms1/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int result = service.add(a, b);
        return "MS 1.1 - Additon = " + result;
    }
}
