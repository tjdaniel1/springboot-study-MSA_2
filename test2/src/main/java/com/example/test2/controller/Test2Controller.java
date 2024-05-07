package com.example.test2.controller;

import com.example.test2.client.Test1Client;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test2")
@RequiredArgsConstructor
public class Test2Controller {
    private final Test1Client test1Client;

    @GetMapping
    public String test2(){
        return "test2" + test1Client.test1();
    }
}
