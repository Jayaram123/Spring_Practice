package com.ram.practice.spring.core1.example2;

import org.springframework.stereotype.Component;

@Component
public class HtmlMessageProvider implements MessageProvider {

    public String message() {
        return "HTML Message";
    }
}
