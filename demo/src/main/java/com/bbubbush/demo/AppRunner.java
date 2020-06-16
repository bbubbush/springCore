package com.bbubbush.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;
import org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator;

import javax.annotation.Resource;

@Component
public class AppRunner implements ApplicationRunner{
    // spring boot default options
    @Autowired HandlerAdapter[] adapter;
    @Autowired HandlerExceptionResolver[] handlerExceptionResolver;
    @Autowired ViewResolver[] viewResolvers;
//    @Autowired DefaultRequestToViewNameTranslator defaultRequestToViewNameTranslator;
    @Autowired MultipartResolver multipartResolver;
//    @Autowired LocaleResolver localeResolver;


    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============[ HandlerAdapter ]=================");
        for (HandlerAdapter handlerAdapter : adapter) {
            System.out.println(handlerAdapter.getClass());
        }
        System.out.println("\n==============[ HandlerExceptionResolver ]=================");
        for (HandlerExceptionResolver resolver : handlerExceptionResolver) {
            System.out.println(resolver.getClass());
        }
        System.out.println("\n==============[ ViewResolver ]=================");
        for (ViewResolver viewResolver : viewResolvers) {
            System.out.println(viewResolver.getClass());
        }
//        System.out.println("\n==============[ DefaultRequestToViewNameTranslator ]=================");
//        System.out.println(defaultRequestToViewNameTranslator.getClass());

        System.out.println("\n==============[ MultipartResolver ]=================");
        System.out.println(multipartResolver.getClass());

//        System.out.println("\n==============[ LocaleResolver ]=================");
//        System.out.println(localeResolver.getClass());

    }
}
