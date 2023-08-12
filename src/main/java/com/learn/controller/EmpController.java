package com.learn.controller;

import com.learn.util.SampleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class EmpController {
    @Autowired
    SampleUtil sampleUtil;

    @GetMapping("/hello")
    public String hello(){
        sampleUtil.testUtil();
        return "hello";
    }
}
