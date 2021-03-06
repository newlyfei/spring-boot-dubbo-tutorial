package com.tutorial;

import com.tutorial.dubbo.DubboTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class ClientApplication {
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        DubboTestService testService = run.getBean(DubboTestService.class);
        testService.printName();
    }
}
