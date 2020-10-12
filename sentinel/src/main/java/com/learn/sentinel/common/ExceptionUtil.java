package com.learn.sentinel.common;

import com.alibaba.csp.sentinel.slots.block.BlockException;

// ExceptionUtil.java
public class ExceptionUtil {
    public static  void handleException(BlockException ex) {
        System.out.println("Oops: " + ex.getClass().getCanonicalName());
    }
}