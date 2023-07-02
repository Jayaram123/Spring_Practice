package com.ram.practice.spring.core1.example2;

import org.springframework.stereotype.Component;

@Component
public class XmlMessageProvider implements MessageProvider {

    public String message() {
        return "XML Message";
    }
}
