package com.example.demo.controller;

import com.example.demo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021/1/14.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/consumer")
    public String consumber() {
        return helloRemote.helloRomote("zz");
    }
}
