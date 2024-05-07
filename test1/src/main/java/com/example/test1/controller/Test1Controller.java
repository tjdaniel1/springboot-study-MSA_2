package com.example.test1.controller;

import com.example.test1.dto.Test1Request;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test1")
public class Test1Controller {
    @GetMapping
    public String test1() {
        return "test1";
    }

    @PostMapping
    public Test1Request save(@Valid @RequestBody Test1Request request){
        return request;
    }
}
