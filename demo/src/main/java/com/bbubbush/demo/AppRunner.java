package com.bbubbush.demo;

import com.bbubbush.demo.logic.controller.DemoController;
import com.bbubbush.demo.logic.repositories.DemoRepository;
import com.bbubbush.demo.logic.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    DemoController controller;
    @Autowired
    DemoService service;
    @Autowired
    DemoRepository repository;
    @Autowired
    Environment environment;
    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(controller);
        System.out.println(service);
        System.out.println(repository);
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(environment.getProperty("hello"));
        System.out.println(environment.getProperty("enviroment.scope"));

        while(true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"bbubbush"}, Locale.getDefault()));
            System.out.println(messageSource.getMessage("greeting", new String[]{"bbubbush"}, Locale.ENGLISH));
            Thread.sleep(3000);
        }
    }
}
