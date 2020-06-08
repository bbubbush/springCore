package com.bbubbush.demo;

import com.bbubbush.demo.logic.controller.DemoController;
import com.bbubbush.demo.logic.domain.DemoDomain;
import com.bbubbush.demo.logic.repositories.DemoRepository;
import com.bbubbush.demo.logic.service.DemoService;
import com.bbubbush.demo.logic.validator.DemoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner{
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

    @Autowired
    ApplicationContext context;

    @Autowired
    Validator validator;

    public void run(ApplicationArguments args) throws Exception {
        System.out.println(controller);
        System.out.println(service);
        System.out.println(repository);
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(environment.getProperty("hello"));
        System.out.println(environment.getProperty("enviroment.scope"));
        System.out.println(context.getClass());

//        final DemoDomain demoDomain = new DemoDomain();
////        demoDomain.setTitle("title");
//        final DemoValidator demoValidator = new DemoValidator();
//        final BeanPropertyBindingResult errors = new BeanPropertyBindingResult(demoDomain, "demoDomain");
//
//        demoValidator.validate(demoDomain, errors);
//
//        System.out.println("validator error is :: " + errors.hasErrors());
//        errors.getAllErrors().forEach(e->{
//            System.out.println("=======================");
//            Arrays.stream(e.getCodes()).forEach(System.out::println);
//            System.out.println(e.getDefaultMessage());
//        });
//        if (  errors.hasErrors() ) {
//            System.out.println(errors.getFieldError().getField());
//        }
        System.out.println(validator.getClass());
        final DemoDomain demoDomain2 = new DemoDomain();
        demoDomain2.setId(-1L);
        final BeanPropertyBindingResult errors2 = new BeanPropertyBindingResult(demoDomain2, "demoDomain2");
        validator.validate(demoDomain2, errors2);
        System.out.println("validator error is :: " + errors2.hasErrors());
        errors2.getAllErrors().forEach(e->{
            System.out.println("=======================");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
        if (  errors2.hasErrors() ) {
            System.out.println(errors2.getFieldError().getField());
        }


    }
}
