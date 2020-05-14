package com.bbubbush.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class PrototypeBean {
    @Autowired
    private SingleBean singleBean;
}
