package com.learn.openfeign.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${test.open.feign}")
public interface TestOpenfeign {
    //,consumes = "application/x-www-form-urlencoded"
    @RequestMapping(value = "/nacos/test",method = RequestMethod.GET)
    public String nacosTest();
}
