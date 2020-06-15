package com.bbubbush.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;

@Component
public class AppRunner implements ApplicationRunner{
    // spring boot default options
    @Autowired
    StandardServletMultipartResolver multipartResolver;

    @Autowired
    HandlerMapping mapping;

    @Autowired
    HandlerAdapter adapter;


    public void run(ApplicationArguments args) throws Exception {
        System.out.println(multipartResolver.getClass());
        System.out.println(mapping.getClass());
        System.out.println(adapter.getClass());

    }
}
