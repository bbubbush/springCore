package com.bbubbush.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


public class ScopeRunner implements ApplicationRunner {
    @Autowired
    private PrototypeBean prototype;
    @Autowired
    private SingleBean single;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(prototype);
        System.out.println(prototype);
        System.out.println(prototype);

        System.out.println(single);
        System.out.println(single);
        System.out.println(single);
    }
}
