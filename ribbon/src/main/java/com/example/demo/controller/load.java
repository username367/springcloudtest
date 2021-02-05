package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2021/1/14.
 */
@RestController
public class load {
    @Autowired
    private RestTemplate restTemplete;
    @GetMapping("/consumer")
    public String consumber() {
        return
                restTemplete.getForObject(
                        "http://PRODUCER/hello?name=kkk",String.class);
    }
}
