package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return "hello1";
    }

    @GetMapping("/hello3")
    public String hello3(){
        return "hello3";
    }

}
