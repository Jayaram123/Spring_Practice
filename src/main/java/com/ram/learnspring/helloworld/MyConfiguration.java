package com.ram.learnspring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record City(String firstLine, String city) {
};

record Person(String name, int age, City city) {
};


@Configuration
public class MyConfiguration {

    @Bean
    public String name() {
        return "Ram";
    }


    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Jaya", 30, new City("Medow", "Irving"));
    }

    @Bean
    public Person person1MethodCall() {
        return new Person(name(), age(), city());
    }

    @Bean
    public Person person1Parameter(String name, int age, City city) {
        return new Person(name, age, city);
    }

    @Bean
    public City city() {
        return new City("MedowCreek", "Irving");
    }
}
