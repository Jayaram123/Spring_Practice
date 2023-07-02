package com.ram.learnspring.helloworld;

import com.ram.learnspring.helloworld.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingMain {

    //create spring context
    //and configure the things

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(MyConfiguration.class)) {

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("city"));
            System.out.println(context.getBean("person1MethodCall"));
            System.out.println(context.getBean("person1Parameter"));
        }
        ;
    }
}
