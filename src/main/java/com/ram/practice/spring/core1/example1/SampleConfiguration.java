package com.ram.practice.spring.core1.example1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Address(String line1, String line2) {
}

record Person(String name, int age, Address address) {
}

@Configuration
public class SampleConfiguration {


    @Bean
    public String name() {
        return "Malli";
    }

    @Bean
    public Integer age() {
        return 22;
    }

    @Bean
    @Primary
    @Qualifier("person1")
    public Person person1() {
        return new Person(name(), age(), new Address("Chirala", "Guntur"));
    }

    @Bean
    //@Qualifier("person2")
    public Person person2(String name, int age, @Qualifier("malli") Address address) {
        return new Person(name, age, address);
    }

    @Bean
    @Qualifier("jaya")
    public Address address1() {
        return new Address("Dallas", "Tx");
    }

    @Bean
    @Qualifier("malli")
    public Address address2() {
        return new Address("Mothinagar", "Hyderabad");
    }
}
