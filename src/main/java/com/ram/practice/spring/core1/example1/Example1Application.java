package com.ram.practice.spring.core1.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Example1Application {

    public static void main(String[] args) {

        var mySpringContext = new AnnotationConfigApplicationContext(SampleConfiguration.class);
       /* System.out.println(mySpringContext.getBean("name"));
        System.out.println(mySpringContext.getBean("age"));
        System.out.println(mySpringContext.getBean(Person.class));*/
        String[] beanDefinitionNames = mySpringContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
