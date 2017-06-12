package com.xzf.spring.cloud.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/demo")
public class DemoController {


    @GetMapping(value = "/one")
    public String testOne(){
        return "demo method one";
    }

    @GetMapping(value = "/two")
    public String testTwo(){
        return "demo method two";
    }


}
