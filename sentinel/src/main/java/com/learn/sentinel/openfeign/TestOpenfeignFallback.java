package com.learn.sentinel.openfeign;

import org.springframework.stereotype.Component;

@Component
public class TestOpenfeignFallback implements TestOpenfeign {
    @Override
    public String nacosTest() {
        return "default";
    }
}
