package com.tutorial;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.tutorial.dubbo.impl")
public class ServerApplication
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context=SpringApplication.run(ServerApplication.class,args);
        System.out.println("------------------ ServerApplication started. ---------------------------");
    }
}
