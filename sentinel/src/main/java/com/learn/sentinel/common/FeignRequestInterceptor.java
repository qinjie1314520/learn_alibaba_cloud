package com.learn.sentinel.common;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

@Component
public class FeignRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {

        System.out.println("请求url={},method={},headers={},body={}"+"\n"+requestTemplate.url()+"\n"+
                requestTemplate.method()+"\n"+
                requestTemplate.headers()+"\n"+
                new String(requestTemplate.body()==null?(new byte[2]):requestTemplate.body())
        );
    }
}