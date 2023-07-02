package com.ram.practice.spring.core1.example2;

import com.ram.practice.spring.core1.example2.configuration.MessageConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Example2Application {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        //Arrays.stream(beanDefinitionNames).forEach(System.out::println);

        MessageRenderer bean = context.getBean(MessageRenderer.class);
        bean.render();
    }
}
