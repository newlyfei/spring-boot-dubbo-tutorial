package com.tutorial.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tutorial.dubbo.DubboTestService;

@Service(version = "1.0.0")
public class DubboTestServiceImpl implements DubboTestService {

    public String printName(){
        return "zhang san";
    }
}
