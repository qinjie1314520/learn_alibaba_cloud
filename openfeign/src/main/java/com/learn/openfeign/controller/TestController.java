package com.learn.openfeign.controller;

import com.learn.openfeign.openfeign.TestOpenfeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/openfeign")
@RestController
public class TestController {
    @Autowired
    private TestOpenfeign testOpenfeign;
    @GetMapping("/test")
    public String test(){
        return testOpenfeign.nacosTest();
    }
}
