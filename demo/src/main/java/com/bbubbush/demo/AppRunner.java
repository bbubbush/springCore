package com.bbubbush.demo;

import com.bbubbush.demo.logic.controller.DemoController;
import com.bbubbush.demo.logic.repositories.DemoRepository;
import com.bbubbush.demo.logic.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    DemoController controller;

    @Autowired
    DemoService service;

    @Autowired
    DemoRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(controller);
        System.out.println(service);
        System.out.println(repository);
    }
}
