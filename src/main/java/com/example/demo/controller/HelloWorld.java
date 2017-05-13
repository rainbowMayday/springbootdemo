package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abc on 2017/5/13.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World !";
    }
}
