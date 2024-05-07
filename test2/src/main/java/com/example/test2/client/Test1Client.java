package com.example.test2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("TEST1")
public interface Test1Client {
    @GetMapping("/api/test1")
    String test1();


}
