package com.bbubbush.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        String[] beanNamse = context.getBeanDefinitionNames();
//        System.out.println(Arrays.asList(beanNamse).toString());
        SpringApplication.run(Demo1Application.class, args);
    }

}
