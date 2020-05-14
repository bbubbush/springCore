package com.bbubbush.chapter15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    SingletonBean singletonBean;
    @Autowired
    PrototypeBean prototypeBean;
    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("singletonBean");
        System.out.println(singletonBean);
        System.out.println(prototypeBean.singletonBean);
        System.out.println(singletonBean);

        System.out.println("prototypeBean");
        System.out.println(prototypeBean);
        System.out.println(singletonBean.prototypeBean);
        System.out.println(singletonBean.prototypeBean);

        System.out.println("prototypeBean by singleton");
        System.out.println(context.getBean(SingletonBean.class).prototypeBean);
        System.out.println(context.getBean(SingletonBean.class).prototypeBean);
        System.out.println(context.getBean(SingletonBean.class).prototypeBean);

        System.out.println("singleton by prototype");
        System.out.println(context.getBean(PrototypeBean.class).singletonBean);
        System.out.println(context.getBean(PrototypeBean.class).singletonBean);
        System.out.println(context.getBean(PrototypeBean.class).singletonBean);


    }
}
