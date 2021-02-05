package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021/1/14.
 */
@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello! "+name;
    }
}
