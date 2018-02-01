package com.tutorial.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tutorial.dubbo.service.AnnotateService;

@Service
public class AnnotateServiceImpl implements AnnotateService {
    public String printName(){
        return "zhang san";
    }
}
